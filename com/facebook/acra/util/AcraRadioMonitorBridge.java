package com.facebook.acra.util;

import android.os.SystemClock;
import java.io.OutputStream;

/* loaded from: AcraRadioMonitorBridge.class */
public class AcraRadioMonitorBridge {
    public static volatile AcraRadioListener mListener;

    /* loaded from: AcraRadioMonitorBridge$OutputStreamDecorator.class */
    public class OutputStreamDecorator extends OutputStream {
        public boolean closed;
        public final OutputStream mDecoratedStream;
        public final AcraRadioListener mListener;

        public OutputStreamDecorator(OutputStream outputStream, AcraRadioListener acraRadioListener) {
            this.mDecoratedStream = outputStream;
            this.mListener = acraRadioListener;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                if (!this.closed) {
                    this.mDecoratedStream.close();
                    this.closed = true;
                }
            } finally {
                this.mListener.onRadioActive(elapsedRealtime, SystemClock.elapsedRealtime(), 0);
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                this.mDecoratedStream.flush();
            } finally {
                this.mListener.onRadioActive(elapsedRealtime, SystemClock.elapsedRealtime(), 0);
            }
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                this.mDecoratedStream.write(i);
            } finally {
                this.mListener.onRadioActive(elapsedRealtime, SystemClock.elapsedRealtime(), 1);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                this.mDecoratedStream.write(bArr);
            } finally {
                this.mListener.onRadioActive(elapsedRealtime, SystemClock.elapsedRealtime(), bArr.length);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                this.mDecoratedStream.write(bArr, i, i2);
            } finally {
                this.mListener.onRadioActive(elapsedRealtime, SystemClock.elapsedRealtime(), i2);
            }
        }
    }

    public static OutputStream createOutputDecorator(OutputStream outputStream) {
        return mListener != null ? new OutputStreamDecorator(outputStream, mListener) : outputStream;
    }

    public static void setRadioListener(AcraRadioListener acraRadioListener) {
        mListener = acraRadioListener;
    }
}
