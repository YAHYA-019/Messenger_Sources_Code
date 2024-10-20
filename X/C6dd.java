package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.video.plugins.subtitle.SubtitlePlugin;
import com.facebook.video.subtitles.views.FbSubtitleView;

/* renamed from: X.6dd, reason: invalid class name */
/* loaded from: 6dd.class */
public abstract class C6dd extends C6d5 {
    public 6TI A00;
    public boolean A01;
    public final ViewStub A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6dd(Context context) {
        super(context, null, 0);
        11T.A0F(context, 1);
        A0C(A0l());
        ViewStub viewStub = (ViewStub) C09s.A01(this, 2131366604);
        this.A02 = viewStub;
        viewStub.setLayoutResource(A0k());
        this.A01 = false;
    }

    @Override // X.C6d6
    public void A0e(6TI r302, boolean z) {
        11T.A0F(r302, 0);
        this.A00 = r302;
    }

    public int A0k() {
        return 2132543408;
    }

    public int A0l() {
        return this instanceof SubtitlePlugin ? 2132543409 : 2132543403;
    }

    public void A0m(View view) {
        ((SubtitlePlugin) this).A05 = (FbSubtitleView) view.findViewById(2131367733);
    }

    public final boolean A0n() {
        if (!this.A01 && A0o(this.A00)) {
            View inflate = this.A02.inflate();
            if (inflate == null) {
                throw 1BK.A0h();
            }
            this.A0L.add(inflate);
            A0m(inflate);
            this.A01 = true;
        }
        return this.A01;
    }

    public boolean A0o(6TI r302) {
        return (r302 != null && r302.A04()) || ((SubtitlePlugin) this).A04 != null;
    }
}
