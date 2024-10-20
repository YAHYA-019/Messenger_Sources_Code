package X;

import com.facebook.messaging.model.threads.NotificationSetting;

/* loaded from: Cu9.class */
public final class Cu9 implements DJd {
    public final NotificationSetting A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public Cu9(NotificationSetting notificationSetting, Integer num, String str, String str2) {
        11T.A0F(notificationSetting, 3);
        this.A03 = str2;
        this.A00 = notificationSetting;
        this.A01 = num;
        this.A02 = str;
    }

    @Override // X.DJd
    public String AWg() {
        return "";
    }

    @Override // X.DJd
    public String AhU() {
        return "";
    }

    @Override // X.DJd
    public C1u3 ApY() {
        return null;
    }

    @Override // X.DJd
    public /* synthetic */ int Apg() {
        return 0;
    }

    @Override // X.DJd
    public int Apm() {
        return 28;
    }

    @Override // X.DJd
    public /* synthetic */ Bpf AqH() {
        return null;
    }

    @Override // X.DJd
    public /* bridge */ /* synthetic */ CharSequence getTitle() {
        return this.A02;
    }
}
