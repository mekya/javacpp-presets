#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" srt
    popd
    exit
fi

SRT_VERSION=1.5.1
download https://github.com/Haivision/srt/archive/refs/tags/v${SRT_VERSION}.zip srt-v${SRT_VERSION}.zip
mkdir -p $PLATFORM
cd $PLATFORM
#tar -xzvf ../srt-v$SRT_VERSION.zip
unzip ../srt-v$SRT_VERSION.zip 
cd srt-$SRT_VERSION



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
        export OPENSSL_ROOT_DIR=/usr/local/opt/openssl/
        ./configure --prefix=.. 
        make -j $MAKEJ
        make install
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

cd ../..
