package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: Gre.class */
public final class Gre extends BJB implements DG4, CallerContextable {
    public static final String __redex_internal_original_name = "MessengerRingtoneSelectFragment";
    public Uri A00;
    public ICX A01;
    public 5rQ A02;
    public int A03;
    public Hm3 A04;
    public ThreadKey A05;
    public DIi A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public final C00i A0E = AbH.A0S();
    public final C00i A0D = 1BQ.A01();
    public final 5II A0H = (5II) 1Bi.A03(68025);
    public final C00i A0C = 1BV.A00(116344);
    public final C00i A0F = 1BQ.A02(17011);
    public final C00i A0G = 1BQ.A02(66536);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x00b5, code lost:
    
        if (r0 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private X.QJB A03(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gre.A03(X.1Iw):X.QJB");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A06(Uri uri, Gre gre) {
        float A00;
        5rQ r303;
        5rQ r0 = gre.A02;
        if (r0 != null) {
            r0.A08();
            gre.A02 = null;
        }
        int i = gre.A03;
        5II r02 = gre.A0H;
        if (i == 1) {
            r303 = 5IJ.A03(r02, uri);
            r303.A01 = true;
            A00 = 1.0f;
        } else {
            Context context = gre.getContext();
            11T.A0F(context, 1);
            A00 = 5II.A00(context, uri, r02);
            if (!5II.A02(r02)) {
                r303 = null;
                gre.A02 = r303;
            }
            r303 = 5IJ.A03(r02, uri);
        }
        r303.A0A(uri, A00, 1);
        gre.A02 = r303;
    }

    public 1iF A1R() {
        return AbF.A0C(301578351120862L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v59, types: [X.Hm3, java.lang.Object] */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        Bundle requireArguments = requireArguments();
        1G3 r0 = new 1G3(requireArguments.getString("RINGTONE_PREF_KEY"));
        this.A03 = requireArguments.getInt("RINGTONE_TYPE");
        String string = requireArguments.getString("FB_RINGTONE_URI");
        this.A05 = (ThreadKey) requireArguments.getParcelable("THREAD_KEY");
        Context context = getContext();
        FbSharedPreferences A0S = 1BK.A0S(this.A0E);
        C01s c01s = (C01s) this.A0D.get();
        C00i c00i = this.A0C;
        ICX icx = new ICX(context, c01s, this.A05, (HmR) c00i.get(), this.A0H, A0S, r0, this.A03);
        this.A01 = icx;
        icx.A02 = string;
        this.A07 = icx.A03();
        String string2 = requireArguments.getString("RINGTONE_FRAGMENT_TITLE");
        this.A0A = r0.equals(1NK.A2s);
        this.A0B = r0.equals(BaD.A0K);
        this.A08 = this.A01.A05();
        if (string2 == null) {
            Context context2 = getContext();
            int i = 2131964593;
            if (r0.A0A(1NK.A2m)) {
                i = 2131963615;
            }
            string2 = context2.getString(i);
        }
        this.A09 = string2;
        ?? obj = new Object();
        this.A04 = obj;
        obj.A00 = new RFk(this);
        HmR hmR = (HmR) c00i.get();
        ThreadKey threadKey = this.A05;
        int i2 = this.A03;
        0DA r02 = new 0DA();
        if (threadKey != null) {
            AbstractC2326GOr.A15(threadKey.A1K() ? EnumC03583yg.A0G : EnumC03583yg.A0D, r02, threadKey, 1BK.A0w(threadKey));
        }
        0DA r03 = new 0DA();
        int i3 = 1;
        int i4 = 1;
        if (threadKey == null) {
            i4 = 4;
        }
        if (i2 != 1) {
            i3 = 2;
        }
        7zN.A14(r03, "surface", i4);
        7zN.A14(r03, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i3);
        1UG A08 = 1BK.A08(1Br.A02(hmR.A00), 1BJ.A00(1876));
        if (A08.isSampled()) {
            A08.A7T(r02, "thread");
            A08.A7T(r03, "notif");
            A08.BZL();
        }
        A1c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        Cursor cursor;
        Context context;
        Uri A01;
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView == null || getContext() == null) {
            return;
        }
        A1b();
        ICX icx = this.A01;
        if (icx.A00 == null) {
            icx.A00 = new RYi(icx);
            String A05 = icx.A05();
            if (A05 != null && !icx.A00.A01.containsKey(A05)) {
                RYi rYi = icx.A00;
                ICX icx2 = rYi.A02;
                Uri uri = null;
                try {
                    uri = C0A2.A03(A05);
                } catch (SecurityException unused) {
                }
                RYi.A00(rYi, ICX.A00(uri, icx2), A05, "custom");
            }
            RYi.A00(icx.A00, icx.A01, icx.A02, "messenger_default");
            int i = icx.A04;
            if (i == 1) {
                RYi.A00(icx.A00, icx.A03, ICX.A0D, "none");
            }
            if (i == 2) {
                ImmutableList immutableList = 5IH.A00;
                11T.A0A(immutableList);
                Iterator it = immutableList.iterator();
                while (it.hasNext()) {
                    C46B A09 = icx.A09.A09(AnonymousClass001.A0i(it));
                    if (A09 != null && (A01 = A09.A01((context = icx.A05))) != null) {
                        RYi rYi2 = icx.A00;
                        int i2 = A09.A00;
                        RYi.A00(rYi2, i2 == 0 ? "" : context.getResources().getString(i2), A01.toString(), "system");
                    }
                }
            }
            RingtoneManager ringtoneManager = new RingtoneManager(icx.A05);
            ringtoneManager.setType(i);
            try {
                cursor = ringtoneManager.getCursor();
                while (cursor.moveToNext()) {
                    try {
                        RYi.A00(icx.A00, cursor.getString(1), AnonymousClass001.A0e("/", AnonymousClass001.A0n(cursor.getString(2)), cursor.getInt(0)), "system");
                    } catch (Throwable th) {
                        th = th;
                        try {
                            icx.A06.softReport("RingtoneListDialogHelper_initRingtoneList", "initRingtoneList failed", th);
                        } finally {
                            if (cursor != null) {
                                cursor.close();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
        }
        1Iw A0P = AbI.A0P(this);
        C9bw c9bw = new C9bw();
        c9bw.A04 = this.A09;
        lithoView.A0x(this.A06 == null ? A1Z(A03(A0P), new 1Iw(A0P), c9bw.A00()) : A03(A0P));
    }

    @Override // X.DG4
    public void ClX(DIi dIi) {
        this.A06 = dIi;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.A04.A00(intent, i, i2)) {
            return;
        }
        super/*X.DZJ*/.onActivityResult(i, i2, intent);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-499771604);
        LithoView A1Y = A1Y(layoutInflater, viewGroup);
        0FI.A08(-497175579, A02);
        return A1Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1218259612);
        super/*androidx.fragment.app.Fragment*/.onPause();
        5rQ r0 = this.A02;
        if (r0 != null) {
            r0.A08();
            this.A02 = null;
        }
        0FI.A08(-1035753843, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(-340725102);
        super/*androidx.fragment.app.Fragment*/.onStart();
        DIi dIi = this.A06;
        if (dIi != null) {
            dIi.Cgl(this.A09);
        }
        0FI.A08(-85485851, A02);
    }

    public void onStop() {
        0DA r310;
        0DA r311;
        04J A02;
        int i;
        int A022 = 0FI.A02(469041320);
        super/*X.DZJ*/.onStop();
        boolean equals = this.A07.equals(this.A01.A03());
        HmR hmR = (HmR) this.A0C.get();
        if (equals) {
            ThreadKey threadKey = this.A05;
            int i2 = this.A03;
            r310 = new 0DA();
            if (threadKey != null) {
                AbstractC2326GOr.A15(threadKey.A1K() ? EnumC03583yg.A0G : EnumC03583yg.A0D, r310, threadKey, 1BK.A0w(threadKey));
            }
            r311 = new 0DA();
            int i3 = 1;
            int i4 = 1;
            if (threadKey == null) {
                i4 = 4;
            }
            if (i2 != 1) {
                i3 = 2;
            }
            7zN.A14(r311, "surface", i4);
            7zN.A14(r311, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i3);
            A02 = 1Br.A02(hmR.A00);
            i = 1136;
        } else {
            ThreadKey threadKey2 = this.A05;
            int i5 = this.A03;
            String str = this.A07;
            String A03 = this.A01.A03();
            String str2 = this.A01.A02().A00;
            r310 = new 0DA();
            if (threadKey2 != null) {
                AbstractC2326GOr.A15(threadKey2.A1K() ? EnumC03583yg.A0G : EnumC03583yg.A0D, r310, threadKey2, 1BK.A0w(threadKey2));
            }
            r311 = new 0DA();
            int i6 = 1;
            int i7 = 1;
            if (threadKey2 == null) {
                i7 = 4;
            }
            if (i5 != 1) {
                i6 = 2;
            }
            7zN.A14(r311, "surface", i7);
            7zN.A14(r311, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i6);
            r311.A07("previous_sound", str);
            r311.A07("current_sound", A03);
            r311.A07("default_sound", str2);
            A02 = 1Br.A02(hmR.A00);
            i = 2118;
        }
        1UG A08 = 1BK.A08(A02, 1BJ.A00(i));
        if (A08.isSampled()) {
            A08.A7T(r311, "notif");
            A08.A7T(r310, "thread");
            A08.BZL();
        }
        Uri uri = this.A00;
        if (uri != null && !this.A08.equals(uri)) {
            boolean A07 = ((21W) this.A0G.get()).A07();
            if (this.A0A && A07) {
                2Pj r0 = (2Pj) this.A0F.get();
                Uri uri2 = this.A00;
                AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
                audioAttributes.getClass();
                r0.A0H(audioAttributes, uri2, 1BJ.A00(483), "Updating channel sound");
            }
            if (this.A0B && A07) {
                2Pj r02 = (2Pj) this.A0F.get();
                Uri uri3 = this.A00;
                AudioAttributes audioAttributes2 = Notification.AUDIO_ATTRIBUTES_DEFAULT;
                audioAttributes2.getClass();
                r02.A0H(audioAttributes2, uri3, "messenger_orca_200_sms", "Updating sms channel sound");
            }
        }
        0FI.A08(1896852023, A022);
    }
}
