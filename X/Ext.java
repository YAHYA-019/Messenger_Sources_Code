package X;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.concurrent.locks.ReadWriteLock;

/* loaded from: Ext.class */
public final class Ext {
    public final EbR A00;
    public final EditText A01;

    public Ext(EditText editText) {
        this.A01 = editText;
        this.A00 = new EbR(editText);
    }

    public KeyListener A00(KeyListener keyListener) {
        boolean z = keyListener instanceof NumberKeyListener;
        if (!(!z)) {
            return keyListener;
        }
        KeyListener keyListener2 = keyListener;
        if (!(keyListener instanceof FX7)) {
            if (keyListener == null) {
                keyListener2 = null;
            } else if (!z) {
                return new FX7(keyListener);
            }
        }
        return keyListener2;
    }

    public InputConnection A01(EditorInfo editorInfo, InputConnection inputConnection) {
        EbR ebR = this.A00;
        if (inputConnection == null) {
            inputConnection = null;
        } else {
            F4i f4i = ebR.A00;
            if (!(inputConnection instanceof DPG)) {
                return new DPG(editorInfo, inputConnection, f4i.A00);
            }
        }
        return inputConnection;
    }

    public void A02(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.A01.getContext().obtainStyledAttributes(attributeSet, 53Y.A08, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            FX5 fx5 = this.A00.A00.A01;
            if (fx5.A01 != z) {
                if (fx5.A00 != null) {
                    L8x A00 = L8x.A00();
                    KTB ktb = fx5.A00;
                    0RZ.A03(ktb, "initCallback cannot be null");
                    ReadWriteLock readWriteLock = A00.A06;
                    readWriteLock.writeLock().lock();
                    try {
                        A00.A05.remove(ktb);
                    } finally {
                        readWriteLock.writeLock().unlock();
                    }
                }
                fx5.A01 = z;
                if (z) {
                    FX5.A00(fx5.A02, L8x.A00().A01());
                }
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
