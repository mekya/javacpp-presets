#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" srt
    popd
    exit
fi

#SRT_VERSION=1.4.4
COMPRESSED_FILE_NAME=zixi_sdks-antmedia-linux64-14.13.44304.tar.xz
FOLDER_NAME=zixi_sdks-antmedia-linux64-14.13.44304
FILE=/Users/mekya/Downloads/zixi_sdks-antmedia-linux64-14.13.44304.tar.xz
cp $FILE $TOP_PATH/downloads
#download https://github.com/Haivision/srt/archive/refs/tags/v${SRT_VERSION}.zip zixi_sdks-antmedia-linux64-14.13.44304.tar.xz
cp $FILE .
tar -xzvf $COMPRESSED_FILE_NAME

if [ ! -d "$PLATFORM" ]; then
  mkdir -p $PLATFORM
  mv $FOLDER_NAME/* $PLATFORM/
  #rename folder name for compatibility
  mv $PLATFORM/interface $PLATFORM/include
fi

 cd $PLATFORM


#unzip ../srt-v$SRT_VERSION.zip 



case $PLATFORM in
    android-arm)
        CC="$ANDROID_CC" CFLAGS="$ANDROID_FLAGS" ./configure --prefix=.. --static
        make -j $MAKEJ
        make install
        ;;
    android-arm64)
        CC="$ANDROID_CC" CFLAGS="$ANDROID_FLAGS" ./configure --prefix=.. --static
        make -j $MAKEJ
        make install
        ;;
    android-x86)
        CC="$ANDROID_CC" CFLAGS="$ANDROID_FLAGS" ./configure --prefix=.. --static
        make -j $MAKEJ
        make install
        ;;
    android-x86_64)
        CC="$ANDROID_CC" CFLAGS="$ANDROID_FLAGS" ./configure --prefix=.. --static
        make -j $MAKEJ
        make install
        ;;
    linux-x86)
        CC="gcc -m32 -fPIC" ./configure --prefix=.. --static
        make -j $MAKEJ
        make install
        ;;
    linux-x86_64)
#        CC="gcc -m64 -fPIC" ./configure --prefix=.. --static
       ./configure --prefix=..
        make -j $MAKEJ
        make install
        ;;
    linux-arm64)
#        CC="gcc -m64 -fPIC" ./configure --prefix=.. --static
       ./configure --prefix=..
        make -j $MAKEJ
        make install
        ;;
    macosx-x86_64)
    
        ;;
    windows-x86)
        nmake -f win32/Makefile.msc zlib.lib
        mkdir -p ../include ../lib
        cp zconf.h zlib.h ../include/
        cp zlib.lib ../lib/
        ;;
    windows-x86_64)
        nmake -f win32/Makefile.msc zlib.lib
        mkdir -p ../include ../lib
        cp zconf.h zlib.h ../include/
        cp zlib.lib ../lib/
        ;;
    *)
        echo "Error: Platform \"$PLATFORM\" is not supported"
        ;;
esac

cd ..
