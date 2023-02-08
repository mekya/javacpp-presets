#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" srt
    popd
    exit
fi

SRT_CONFIG="-DENABLE_APPS:BOOL=OFF -DENABLE_ENCRYPTION:BOOL=ON -DENABLE_SHARED:BOOL=OFF -DCMAKE_BUILD_TYPE=Release -DCMAKE_POSITION_INDEPENDENT_CODE=ON -DCMAKE_INSTALL_LIBDIR=lib -DCMAKE_INSTALL_INCLUDEDIR=include -DCMAKE_INSTALL_BINDIR=bin"

LIBSRT_VERSION=1.5.1
OPENSSL=openssl-3.0.5

download https://github.com/Haivision/srt/archive/refs/tags/v$LIBSRT_VERSION.tar.gz srt-$LIBSRT_VERSION.tar.gz
download https://www.openssl.org/source/$OPENSSL.tar.gz $OPENSSL.tar.gz

mkdir -p $PLATFORM
cd $PLATFORM
INSTALL_PATH=`pwd`

tar --totals -xzf ../srt-$LIBSRT_VERSION.tar.gz
tar --totals -xzf ../$OPENSSL.tar.gz

cd srt-$LIBSRT_VERSION



case $PLATFORM in

    linux-x86_64)
        cd ../$OPENSSL
        ./Configure linux-x86_64 -fPIC no-shared --prefix=$INSTALL_PATH --libdir=lib
        make -s -j $MAKEJ
        make install_sw

        cd ../srt-$LIBSRT_VERSION
       ./configure --prefix=$INSTALL_PATH --openssl-include-dir=$INSTALL_PATH/include --openssl-ssl-library=$INSTALL_PATH/lib/libssl.a --openssl-crypto-library=$INSTALL_PATH/lib/libcrypto.a --enable-apps=OFF
        make -j $MAKEJ
        make install
        ;;
    linux-arm64)
        cd ../$OPENSSL
        ./Configure linux-aarch64 -fPIC no-shared --prefix=$INSTALL_PATH --libdir=lib 
        make -s -j $MAKEJ
        make install_sw

        cd ../srt-$LIBSRT_VERSION
        ./configure --prefix=$INSTALL_PATH --openssl-include-dir=$INSTALL_PATH/include --openssl-ssl-library=$INSTALL_PATH/lib/libssl.a --openssl-crypto-library=$INSTALL_PATH/lib/libcrypto.a --enable-apps=OFF
        make -j $MAKEJ
        make install
        ;;
    macosx-x86_64)
        cd ../$OPENSSL
        ./Configure darwin64-x86_64-cc -fPIC no-shared --prefix=$INSTALL_PATH --libdir=lib
        make -j $MAKEJ
        make install_sw

        cd ../srt-$LIBSRT_VERSION
        ./configure  --prefix=$INSTALL_PATH --openssl-include-dir=$INSTALL_PATH/include --openssl-ssl-library=$INSTALL_PATH/lib/libssl.a --openssl-crypto-library=$INSTALL_PATH/lib/libcrypto.a --enable-apps=OFF
        make -j $MAKEJ
        make install
        ;;
    *)
        echo "Error: Platform \"$PLATFORM\" is not supported"
        ;;
esac

cd ../..
