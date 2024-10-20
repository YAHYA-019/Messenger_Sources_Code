package com.facebook.crypto.keychain;

/* loaded from: KeyChain.class */
public interface KeyChain {
    byte[] getCipherKey();

    byte[] getMacKey();

    byte[] getNewIV();
}
