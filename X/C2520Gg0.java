package X;

import android.graphics.drawable.Animatable;
import com.facebook.ui.media.contentsearch.ContentSearchResultItemView;

/* renamed from: X.Gg0, reason: case insensitive filesystem */
/* loaded from: Gg0.class */
public final class C2520Gg0 extends 4gL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ContentSearchResultItemView A01;
    public final /* synthetic */ GWm A02;

    public C2520Gg0(ContentSearchResultItemView contentSearchResultItemView, GWm gWm, int i) {
        this.A02 = gWm;
        this.A00 = i;
        this.A01 = contentSearchResultItemView;
    }

    public void Bxg(String str, Throwable th) {
        this.A01.A06.A03();
    }

    public /* bridge */ /* synthetic */ void Byc(Animatable animatable, Object obj, String str) {
        if (animatable != null) {
            EXs.A00(animatable, true);
        }
        GWm.A00(this.A02);
        this.A01.A06.A02();
    }
}
