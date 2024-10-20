package X;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.litho.LithoView;
import java.util.List;

/* renamed from: X.8uf, reason: invalid class name */
/* loaded from: 8uf.class */
public final class C8uf extends GVb {
    public 1GU A00;
    public LithoView A01;
    public final C23P A02;
    public final C2kx A03;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.23P, java.lang.Object] */
    public C8uf(Context context) {
        super(context, (AttributeSet) null, 0);
        this.A03 = new C2kx();
        ?? obj = new Object();
        this.A02 = obj;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2132279342);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        7zV.A07(context).getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels - dimensionPixelSize;
        int i2 = displayMetrics.widthPixels;
        obj.A00 = i;
        obj.A01 = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C2kV A00(List list) {
        C3Yt c3Yt = new C3Yt(this, 0);
        2kW r0 = new 2kW();
        r0.A01 = 1;
        r0.A06 = c3Yt;
        r0.A02 = -1;
        C2ke A00 = r0.A00();
        C1376Afi c1376Afi = new C1376Afi(this, list);
        LithoView lithoView = this.A01;
        String str = "sectionView";
        if (lithoView != null) {
            C2ki A002 = C2kV.A00(lithoView.A09);
            LithoView lithoView2 = this.A01;
            if (lithoView2 != null) {
                1Iw r02 = lithoView2.A09;
                11T.A0A(r02);
                7zL.A1K(r02);
                8qL r03 = new 8qL();
                str = "androidThreadUtil";
                1GU r04 = this.A00;
                if (r04 != null) {
                    r03.A00 = r04;
                    r03.A01 = this;
                    r03.A02 = list;
                    A002.A2d(r03);
                    A002.A2Z(c1376Afi);
                    A002.A2e(this.A03);
                    A002.A2f(A00);
                    A002.A2j(true);
                    return A002.A2W();
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public int A05() {
        RecyclerView A02 = this.A03.A02();
        if (A02 == null) {
            return 0;
        }
        2XA r0 = A02.A0F;
        11T.A0I(r0, 4YT.A00(43));
        return ((LinearLayoutManager) r0).A1g();
    }

    public View A06() {
        LithoView lithoView = this.A01;
        if (lithoView != null) {
            return lithoView;
        }
        11T.A0L("sectionView");
        throw 0Q8.createAndThrow();
    }

    public void A07() {
        LithoView lithoView = this.A01;
        if (lithoView == null) {
            11T.A0L("sectionView");
            throw 0Q8.createAndThrow();
        }
        lithoView.A0x(A00(C0ty.A00));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A08() {
        LayoutInflater.from(getContext()).inflate(2132542518, (ViewGroup) this);
        this.A00 = 7zQ.A0Q();
        LithoView lithoView = (LithoView) C09s.A01(this, 2131363447);
        this.A01 = lithoView;
        if (lithoView == null) {
            11T.A0L("sectionView");
            throw 0Q8.createAndThrow();
        }
        lithoView.A0x(A00(C0ty.A00));
    }

    public void A0B(int i, boolean z) {
        this.A03.A05(i, z);
    }

    public void A0C(List list, C00m c00m) {
        11T.A0F(list, 0);
        LithoView lithoView = this.A01;
        if (lithoView != null) {
            lithoView.A0x(A00(list));
            LithoView lithoView2 = this.A01;
            if (lithoView2 != null) {
                lithoView2.postDelayed(new S8M(c00m), 500L);
                return;
            }
        }
        11T.A0L("sectionView");
        throw 0Q8.createAndThrow();
    }
}
