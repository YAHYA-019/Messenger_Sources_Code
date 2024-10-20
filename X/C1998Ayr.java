package X;

import android.preference.Preference;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Ayr, reason: case insensitive filesystem */
/* loaded from: Ayr.class */
public final class C1998Ayr extends C1rj {
    public BgI A00;
    public CPi A01;
    public MigColorScheme A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;

    public C1998Ayr() {
        super("PhotosAndMediaPreferenceLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A07, this.A02, this.A01, this.A08, this.A03, this.A04, this.A05, this.A06, this.A00, this.A09, Boolean.valueOf(this.A0B), this.A0A};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A02;
        CPi cPi = this.A01;
        Boolean bool = this.A06;
        Boolean bool2 = this.A04;
        Boolean bool3 = this.A05;
        Boolean bool4 = this.A03;
        String str = this.A09;
        String str2 = this.A0A;
        String str3 = this.A07;
        String str4 = this.A08;
        boolean z = this.A0B;
        BgI bgI = this.A00;
        11T.A0F(r302, 0);
        11T.A0G(migColorScheme, 1, cPi);
        11T.A0F(bgI, 12);
        CQY cqy = new CQY(r302, 7zU.A0T(), migColorScheme);
        if (bool != null) {
            Preference A05 = cPi.A05();
            cqy.A0J(Cvn.A00(bgI, ActionId.QUERY_READY), A05.getTitle(), A05.getSummary(), bool.booleanValue());
        }
        if (bool2 != null) {
            ECT ect = cPi.A05;
            if (ect == null) {
                ect = new ECT(cPi.A08);
                ect.A04(1NK.A1B);
                ect.setTitle(2131963559);
                ect.setDefaultValue(1BK.A0d());
                cPi.A05 = ect;
            }
            cqy.A0K(Cvn.A00(bgI, ActionId.RTMP_PACKET_RECEIVED), ect.getTitle(), bool2.booleanValue());
        }
        if (bool3 != null) {
            Preference A04 = cPi.A04();
            cqy.A0J(Cvn.A00(bgI, 108), A04.getTitle(), A04.getSummary(), bool3.booleanValue());
        }
        if (z) {
            if (cPi.A04 == null) {
                Preference preference = new Preference(cPi.A08);
                cPi.A04 = preference;
                preference.setTitle(2131963549);
            }
            Preference preference2 = cPi.A04;
            if (preference2 == null) {
                11T.A0L("_emojiSkinTonePreference");
                throw 0Q8.createAndThrow();
            }
            CQY.A06(cqy, preference2.getTitle(), bgI, ActionId.RTMP_CONNECTION_REQUESTED);
        }
        if (bool4 != null && bool4.equals(true)) {
            Preference preference3 = cPi.A02;
            if (preference3 == null) {
                preference3 = new Preference(cPi.A08);
                preference3.setTitle(2131963516);
                CPi.A02(preference3, cPi, 4LQ.A0f);
                cPi.A02 = preference3;
            }
            Preference preference4 = cPi.A03;
            if (preference4 == null) {
                preference4 = new Preference(cPi.A08);
                preference4.setTitle(2131963517);
                CPi.A02(preference4, cPi, 4LQ.A0h);
                cPi.A03 = preference4;
            }
            Preference preference5 = cPi.A00;
            if (preference5 == null) {
                preference5 = new Preference(cPi.A08);
                preference5.setTitle(2131963514);
                CPi.A02(preference5, cPi, 4LQ.A01);
                cPi.A00 = preference5;
            }
            Preference preference6 = cPi.A01;
            if (preference6 == null) {
                preference6 = new Preference(cPi.A08);
                preference6.setTitle(2131963515);
                CPi.A02(preference6, cPi, 4LQ.A07);
                cPi.A01 = preference6;
            }
            cqy.A0P(4YU.A0E(r302).getString(2131952990));
            CharSequence title = preference3.getTitle();
            if (str == null) {
                0fH.A0j("PhotosAndMediaPreferenceLayoutSpec", "summary is null");
                str = "";
            }
            CQY.A05(cqy, title, str, bgI, ActionId.RTMP_CONNECTION_RELEASE);
            CharSequence title2 = preference4.getTitle();
            if (str2 == null) {
                0fH.A0j("PhotosAndMediaPreferenceLayoutSpec", "summary is null");
                str2 = "";
            }
            CQY.A05(cqy, title2, str2, bgI, ActionId.NEW_START_FOUND);
            CharSequence title3 = preference5.getTitle();
            if (str3 == null) {
                0fH.A0j("PhotosAndMediaPreferenceLayoutSpec", "summary is null");
                str3 = "";
            }
            CQY.A05(cqy, title3, str3, bgI, ActionId.MISSED_EVENT);
            CharSequence title4 = preference6.getTitle();
            if (str4 == null) {
                0fH.A0j("PhotosAndMediaPreferenceLayoutSpec", "summary is null");
                str4 = "";
            }
            CQY.A05(cqy, title4, str4, bgI, ActionId.TIMEOUT);
        }
        return CQY.A00(cqy);
    }
}
