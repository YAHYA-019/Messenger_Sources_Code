package com.facebook.acra.util;

import java.io.OutputStream;

/* loaded from: OutputStreamFactory.class */
public interface OutputStreamFactory {
    OutputStream create(OutputStream outputStream);

    void finish(OutputStream outputStream);
}
