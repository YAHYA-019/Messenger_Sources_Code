package com.facebook.messaging.communitymessaging.plugins.channelinvite.suggestedgroupsomnipickercomponent;

import X.02L;
import X.11T;
import X.1BL;
import X.1BQ;
import X.1Iw;
import X.2cK;
import X.2cL;
import X.2cM;
import X.4YU;
import X.55C;
import X.55M;
import X.55N;
import X.7zL;
import X.7zP;
import X.7zT;
import X.7zU;
import X.8TR;
import X.AnonymousClass001;
import X.AnonymousClass557;
import X.AnonymousClass558;
import X.BME;
import X.C0A2;
import X.C1yg;
import X.C2fc;
import X.C2fe;
import X.C2py;
import X.C2q0;
import X.C2q1;
import X.C5z5;
import X.CvV;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.data.communitymessaging.DirectInvitePresetModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.omnipicker.plugins.interfaces.secondaryomnipickercomponent.SecondaryOmnipickerComponentExtras;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: SuggestedGroupsOmnipickerComponentImplementation.class */
public final class SuggestedGroupsOmnipickerComponentImplementation {
    public String A00;
    public final int A01;
    public final Context A02;
    public final 1Iw A03;
    public final BME A04;
    public final ThreadKey A05;
    public final ThreadSummary A06;
    public final MigColorScheme A07;
    public final ParcelableSecondaryData A08;
    public final ImmutableList A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final FbUserSession A0D;

    public SuggestedGroupsOmnipickerComponentImplementation(Context context, FbUserSession fbUserSession, 1Iw r304, BME bme, ThreadKey threadKey, ThreadSummary threadSummary, MigColorScheme migColorScheme, ParcelableSecondaryData parcelableSecondaryData, ImmutableList immutableList, String str, String str2, String str3, String str4, int i) {
        11T.A0F(context, 1);
        7zT.A11(2, str, str3, r304, migColorScheme);
        7zP.A1M(threadKey, 7, bme);
        11T.A0F(fbUserSession, 14);
        this.A02 = context;
        this.A0A = str;
        this.A0B = str2;
        this.A0C = str3;
        this.A03 = r304;
        this.A07 = migColorScheme;
        this.A05 = threadKey;
        this.A09 = immutableList;
        this.A04 = bme;
        this.A08 = parcelableSecondaryData;
        this.A01 = i;
        this.A06 = threadSummary;
        this.A00 = str4;
        this.A0D = fbUserSession;
    }

    public final 2cL A00() {
        2cM A00;
        SecondaryOmnipickerComponentExtras secondaryOmnipickerComponentExtras;
        Map map;
        Boolean bool;
        boolean A1W = AnonymousClass001.A1W(this.A05.A06, C1yg.FOLDER);
        ImmutableList immutableList = this.A09;
        if (immutableList != null) {
            1Iw r0 = this.A03;
            A00 = 2cK.A01(r0, (String) null, 0);
            8TR A002 = C5z5.A00(r0);
            Resources A0E = 4YU.A0E(r0);
            int i = 2131966525;
            if (A1W) {
                i = 2131965847;
            }
            A002.A2a(A0E.getString(i));
            MigColorScheme migColorScheme = this.A07;
            A002.A2Z(migColorScheme);
            A00.A2e(A002.A2W());
            FbUserSession fbUserSession = this.A0D;
            1BQ A02 = 1BQ.A02(17068);
            2cM A01 = 2cK.A01(r0, (String) null, 0);
            ParcelableSecondaryData parcelableSecondaryData = this.A08;
            if (parcelableSecondaryData != null && (secondaryOmnipickerComponentExtras = (SecondaryOmnipickerComponentExtras) ParcelableSecondaryData.A00(parcelableSecondaryData, SecondaryOmnipickerComponentExtras.class, null)) != null && (map = secondaryOmnipickerComponentExtras.A00) != null && (bool = (Boolean) map.get("suggested_group")) != null) {
                Iterator it = immutableList.iterator();
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (!it.hasNext()) {
                        break;
                    }
                    int i4 = i3 + 1;
                    DirectInvitePresetModel directInvitePresetModel = (DirectInvitePresetModel) it.next();
                    Uri uri = null;
                    try {
                        uri = C0A2.A03(directInvitePresetModel.A02);
                    } catch (SecurityException unused) {
                    }
                    Uri uri2 = null;
                    try {
                        uri2 = C0A2.A03(directInvitePresetModel.A04);
                    } catch (SecurityException unused2) {
                    }
                    Uri[] uriArr = {uri, uri2};
                    11T.A0F(uriArr, 0);
                    ImmutableList A0a = 1BL.A0a(02L.A08(uriArr));
                    55N A003 = 55M.A00(r0);
                    AnonymousClass557 A0V = 7zU.A0V(migColorScheme);
                    boolean booleanValue = bool.booleanValue();
                    A0V.A0C = booleanValue;
                    A0V.A04(AnonymousClass558.MEDIUM);
                    A0V.A08(directInvitePresetModel.A05);
                    A0V.A07(directInvitePresetModel.A01);
                    C2q1 c2q1 = C2q0.A05;
                    LightColorScheme.A00();
                    C2py c2py = C2py.CIRCULAR;
                    C2fc c2fc = new C2fc();
                    c2fc.A07 = A0a;
                    c2fc.A04 = (C2fe) A02.get();
                    A0V.A05 = 55C.A01(c2q1, c2py, migColorScheme, c2fc.A00(), 0, booleanValue);
                    A0V.A01 = new CvV(i3, 1, fbUserSession, this, directInvitePresetModel);
                    A01.A2e(7zU.A0U(A003, A0V));
                    i2 = i4;
                }
            }
            7zL.A1G(A01, A00);
        } else {
            A00 = 2cK.A00(this.A03);
        }
        return A00.A00;
    }
}
