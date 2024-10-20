package com.facebook.audiofiltercore.interfaces;

/* loaded from: AudioInput.class */
public interface AudioInput {
    void close();

    int read(short[] sArr, int i);
}
