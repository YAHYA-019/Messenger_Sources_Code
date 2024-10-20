package X;

/* renamed from: X.19l, reason: invalid class name */
/* loaded from: 19l.class */
public final class C19l {
    public long A00;
    public 0Gp A01;
    public 0Gp A02;
    public 0Gp A03;
    public Integer A04;
    public String A08;
    public String A0D;
    public boolean A0F;
    public String A0C = "";
    public String A0E = "";
    public String A06 = "";
    public String A0A = "";
    public String A05 = "";
    public String A0B = "";
    public String A09 = "";
    public String A07 = "";

    public C19l() {
        0Go r0 = 0Go.A00;
        this.A01 = r0;
        this.A08 = "";
        this.A0D = "";
        this.A0F = false;
        this.A02 = r0;
        this.A04 = 0S2.A00;
        this.A03 = r0;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder A0o = AnonymousClass001.A0o("FbnsNotificationMessage{mToken='");
        A0o.append(this.A0E);
        A0o.append("', mConnectionKey='");
        A0o.append(this.A06);
        A0o.append("', mPackageName='");
        A0o.append(this.A0A);
        A0o.append("', mCollapseKey='");
        A0o.append(this.A05);
        A0o.append("', mPayload='");
        A0o.append(this.A0B);
        A0o.append("', mNotifId='");
        A0o.append(this.A09);
        A0o.append("', mIsBuffered='");
        A0o.append(this.A07);
        A0o.append("', mLogEvent='");
        A0o.append(this.A01);
        A0o.append("', mSkipStorage='");
        A0o.append(this.A0F);
        A0o.append("', mQueueTimeMs='");
        A0o.append(this.A00);
        A0o.append("', mMqttProcessTimeMs='");
        0Gp r0 = this.A02;
        str = "null";
        A0o.append(r0.A06() ? r0.A05() : str);
        A0o.append("', mJobId='");
        A0o.append(this.A08);
        A0o.append("', mActionType='");
        switch (this.A04.intValue()) {
            case 0:
                str2 = "DEFAULT";
                break;
            case 1:
                str2 = "RTC_HERA";
                break;
            default:
                str2 = "VR";
                break;
        }
        A0o.append(str2);
        A0o.append("', mSource='");
        A0o.append(this.A0D);
        A0o.append("', mTtlInSeconds='");
        0Gp r02 = this.A03;
        A0o.append(r02.A06() ? r02.A05() : "null");
        A0o.append("', mPim='");
        A0o.append(this.A0C);
        return AnonymousClass001.A0d("'}", A0o);
    }
}
