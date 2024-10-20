package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.rtc.incall.impl.effect.uicontrol.PickerList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: GWl.class */
public final class GWl extends 2Xd implements CallerContextable {
    public static final String __redex_internal_original_name = "PickerAdapter";
    public Integer A00;
    public final ArrayList A01 = AnonymousClass001.A0s();
    public final HVE A02;

    public GWl(HVE hve) {
        this.A02 = hve;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2XA, com.facebook.messaging.rtc.incall.impl.effect.uicontrol.PickerLayoutManager, androidx.recyclerview.widget.LinearLayoutManager] */
    public static void A00(HVE hve, PickerList pickerList) {
        pickerList.setImportantForAccessibility(1);
        Context context = pickerList.getContext();
        ?? linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.A0f();
        linearLayoutManager.A00 = context.getResources().getDimensionPixelSize(2132279321);
        linearLayoutManager.A01 = context.getResources().getDimensionPixelSize(2132279327);
        pickerList.A1D(linearLayoutManager);
        GWl gWl = new GWl(hve);
        pickerList.A00 = gWl;
        pickerList.A16(gWl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0034, code lost:
    
        if (r303 != r0.intValue()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BlZ(X.C2lb r302, int r303) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GWl.BlZ(X.2lb, int):void");
    }

    public C2lb Bs3(ViewGroup viewGroup, int i) {
        11T.A0F(viewGroup, 0);
        Context context = viewGroup.getContext();
        View A0G = 7zM.A0G(LayoutInflater.from(context), viewGroup, 2132543269, false);
        A0G.setVisibility(8);
        List list = C2lb.A0J;
        11T.A0A(context);
        return new GXr(A0G);
    }

    public int getItemCount() {
        return this.A01.size();
    }
}
