package X;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.0Su, reason: invalid class name */
/* loaded from: 0Su.class */
public final class C0Su extends WindowInsetsAnimation.Callback {
    public ArrayList A00;
    public List A01;
    public final HashMap A02;
    public final 0Sq A03;

    public C0Su(0Sq r302) {
        super(1);
        this.A02 = AnonymousClass001.A0u();
        this.A03 = r302;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        0Sq r0 = this.A03;
        HashMap hashMap = this.A02;
        0Sw r305 = (0Sw) hashMap.get(windowInsetsAnimation);
        if (r305 == null) {
            r305 = 0Sw.A00(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, r305);
        }
        r0.A02(r305);
        hashMap.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        0Sq r0 = this.A03;
        HashMap hashMap = this.A02;
        0Sw r305 = (0Sw) hashMap.get(windowInsetsAnimation);
        if (r305 == null) {
            r305 = 0Sw.A00(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, r305);
        }
        r0.A03(r305);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.A00;
        if (arrayList == null) {
            ArrayList A0t = AnonymousClass001.A0t(list.size());
            this.A00 = A0t;
            this.A01 = Collections.unmodifiableList(A0t);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                0Sq r0 = this.A03;
                08D r02 = 08D.A01;
                windowInsets.getClass();
                08D r03 = new 08D(windowInsets);
                r0.A01(r03, this.A01);
                return r03.A04();
            }
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            HashMap hashMap = this.A02;
            0Sw r308 = (0Sw) hashMap.get(windowInsetsAnimation);
            if (r308 == null) {
                r308 = 0Sw.A00(windowInsetsAnimation);
                hashMap.put(windowInsetsAnimation, r308);
            }
            r308.A00.A08(windowInsetsAnimation.getFraction());
            this.A00.add(r308);
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        0Sq r0 = this.A03;
        HashMap hashMap = this.A02;
        0Sw r306 = (0Sw) hashMap.get(windowInsetsAnimation);
        if (r306 == null) {
            r306 = 0Sw.A00(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, r306);
        }
        0Sp A00 = 0Sp.A00(bounds);
        r0.A00(A00, r306);
        return A00.A01();
    }
}
