#!/usr/bin/env bash

if [[ "$1" =~ ^[0-9]+\.[0-9]+\.[0-9]+$ ]]; then
    echo "Setting install-version to $1"
    echo "install-version: $1" > $2/install-version.properties
fi
