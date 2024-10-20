package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.DeZ, reason: case insensitive filesystem */
/* loaded from: DeZ.class */
public class C2120DeZ extends EAX implements GCd {
    public RecyclerView A00;
    public DSk A01;

    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(Context context, C2120DeZ c2120DeZ, DSk dSk) {
        DSk dSk2 = c2120DeZ.A01;
        if (dSk2 != null) {
            dSk2.A0O((GCd) null);
        }
        c2120DeZ.A01 = dSk;
        if (c2120DeZ.A00 == null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
            linearLayoutManager.A0f();
            RecyclerView recyclerView = new RecyclerView(context);
            c2120DeZ.A00 = recyclerView;
            DKD.A1B(recyclerView, -1, -2);
            c2120DeZ.A00.A1D(linearLayoutManager);
            RecyclerView recyclerView2 = c2120DeZ.A00;
            TypedArray typedArray = null;
            try {
                TypedArray obtainStyledAttributes = c2120DeZ.getContext().getTheme().obtainStyledAttributes(new int[]{2130968841});
                Drawable drawable = obtainStyledAttributes.getDrawable(0);
                if (drawable == null) {
                    drawable = 7zL.A0D(obtainStyledAttributes.getColor(0, -1));
                }
                obtainStyledAttributes.recycle();
                recyclerView2.setBackgroundDrawable(drawable);
                c2120DeZ.setContentView(c2120DeZ.A00);
            } catch (Throwable th) {
                if (0 != 0) {
                    typedArray.recycle();
                }
                throw th;
            }
        }
        c2120DeZ.A00.A16(c2120DeZ.A01);
        DSk dSk3 = c2120DeZ.A01;
        if (dSk3 != null) {
            dSk3.A0O(c2120DeZ);
        }
    }
}
