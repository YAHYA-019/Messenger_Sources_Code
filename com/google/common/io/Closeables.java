package com.google.common.io;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: Closeables.class */
public final class Closeables {
    public static final Logger A00 = Logger.getLogger(Closeables.class.getName());

    public static void A00(Closeable closeable, boolean z) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (!z) {
                    throw e;
                }
                A00.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
            }
        }
    }

    public static void A01(InputStream inputStream) {
        try {
            A00(inputStream, true);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
