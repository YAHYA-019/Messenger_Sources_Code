package X;

import com.facebook.proxygen.TraceFieldType;
import com.google.common.base.Absent;
import com.google.common.base.Optional;
import com.google.common.base.Present;

/* renamed from: X.3Ur, reason: invalid class name */
/* loaded from: 3Ur.class */
public final class C3Ur implements InterfaceC08314mj {
    public final 2IN A00;

    public C3Ur() {
        2IN r0 = (2IN) 1Bi.A03(65676);
        11T.A0F(r0, 1);
        this.A00 = r0;
    }

    @Override // X.InterfaceC08314mj
    public 2Jy AU5(String str, long j) {
        Absent absent;
        Optional present;
        2IN r0 = this.A00;
        synchronized (r0) {
            2IN.A00(r0);
            if (r0.A00.isPresent()) {
                long now = r0.A02.now();
                Optional optional = r0.A00;
                if (now - ((4iA) optional.get()).A01 >= 86400000) {
                    4iA r02 = (4iA) optional.get();
                    2IL r03 = r0.A04;
                    synchronized (r03) {
                        1Ql edit = r03.A00.edit();
                        edit.CfI(r03.A0A);
                        edit.commit();
                    }
                    r0.A00 = Absent.INSTANCE;
                    r02.getClass();
                    new Present(r02);
                }
            }
            absent = Absent.INSTANCE;
        }
        if (absent.isPresent()) {
            2Jy r04 = new 2Jy("android_image_fetch_efficiency");
            r04.A0D("pigeon_reserved_keyword_module", "photo");
            r04.A0D("calling_class", ((4iA) absent.get()).A05);
            r04.A0D("analytics_tag", ((4iA) absent.get()).A04);
            r04.A0D("feature_tag", ((4iA) absent.get()).A06);
            r04.A0B(TraceFieldType.ContentLength, ((4iA) absent.get()).A00);
            r04.A0F("is_prefetch", ((4iA) absent.get()).A08);
            r04.A0F("is_cancellation_requested", ((4iA) absent.get()).A07);
            r04.A0F("ui_requested", ((4iA) absent.get()).A03.isPresent());
            if (((4iA) absent.get()).A03.isPresent()) {
                r04.A0C("prefetch_to_ui_time", AnonymousClass001.A05(((4iA) absent.get()).A03.get()) - ((4iA) absent.get()).A01);
            }
            r04.getClass();
            present = new Present(r04);
        } else {
            present = Absent.INSTANCE;
        }
        return (2Jy) present.orNull();
    }
}
