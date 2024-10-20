package com.facebook.acra.util;

import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: DefaultOutputStreamFactory.class */
public class DefaultOutputStreamFactory implements OutputStreamFactory {
    @Override // com.facebook.acra.util.OutputStreamFactory
    public OutputStream create(OutputStream outputStream) {
        return new GZIPOutputStream(outputStream);
    }

    @Override // com.facebook.acra.util.OutputStreamFactory
    public void finish(OutputStream outputStream) {
        ((DeflaterOutputStream) outputStream).finish();
    }
}
