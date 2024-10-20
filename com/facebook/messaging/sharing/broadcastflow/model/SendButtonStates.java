package com.facebook.messaging.sharing.broadcastflow.model;

import X.1BK;
import X.1BL;
import X.1BV;
import X.1Du;
import X.4YU;
import X.AbG;
import X.AnonymousClass001;
import X.BMK;
import X.C00i;
import X.CPd;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Map;

/* loaded from: SendButtonStates.class */
public final class SendButtonStates implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(64);
    public final C00i A00;
    public final ImmutableMap A01;

    public SendButtonStates() {
        this.A00 = 1BV.A00(83465);
        this.A01 = RegularImmutableMap.A03;
    }

    public SendButtonStates(Parcel parcel) {
        this.A00 = 1BV.A00(83465);
        int readInt = parcel.readInt();
        ImmutableMap.Builder A0c = 1BK.A0c();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                this.A01 = A0c.build();
                return;
            }
            Parcelable A0C = 1BL.A0C(parcel, ThreadKey.class);
            Parcelable A0C2 = 1BL.A0C(parcel, SendState.class);
            if (A0C != null && A0C2 != null) {
                A0c.put(A0C, A0C2);
            }
            i = i2 + 1;
        }
    }

    public SendButtonStates(ImmutableMap immutableMap) {
        this.A00 = 1BV.A00(83465);
        this.A01 = immutableMap;
    }

    public static SendButtonStates A00(ThreadKey threadKey, SendButtonStates sendButtonStates, SendState sendState) {
        ImmutableMap immutableMap = sendButtonStates.A01;
        ImmutableMap.Builder A0c = 1BK.A0c();
        if (immutableMap.containsKey(threadKey)) {
            1Du A0i = 4YU.A0i(immutableMap);
            while (A0i.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0i);
                if (!A0z.getKey().equals(threadKey)) {
                    A0c.put(A0z.getKey(), A0z.getValue());
                }
            }
        } else {
            A0c.putAll(immutableMap);
        }
        return new SendButtonStates(AbG.A10(A0c, threadKey, sendState));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r301 == X.BMK.A05) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.BMK r301, X.C5Y r302, com.google.common.collect.ImmutableMap r303) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.sharing.broadcastflow.model.SendButtonStates.A01(X.BMK, X.C5Y, com.google.common.collect.ImmutableMap):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (X.1Br.A07(r302.A05).AZk(36313209753573276L) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(X.BMK r301, X.CPd r302) {
        /*
            X.BMK r0 = X.BMK.A06
            r303 = r0
            r0 = r301
            r1 = r303
            if (r0 == r1) goto L1f
            r0 = r301
            if (r0 == 0) goto L16
            r0 = r301
            boolean r0 = r0.isExternalShareSource
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L1f
        L16:
            X.BMK r0 = X.BMK.A05
            r303 = r0
            r0 = r301
            r1 = r303
            if (r0 != r1) goto L38
        L1f:
            r0 = r302
            X.1Br r0 = r0.A06
            r303 = r0
            r0 = r303
            X.00i r0 = X.AbF.A0R(r0)
            r301 = r0
            boolean r0 = X.1BL.A1R()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L40
            r0 = r301
            java.lang.Object r0 = r0.get()
        L38:
            r0 = 0
            r305 = r0
            r0 = 0
            r301 = r0
        L3d:
            r0 = r305
            return r0
        L40:
            r0 = r302
            X.1Br r0 = r0.A05
            r303 = r0
            r0 = r303
            X.2yD r0 = X.1Br.A07(r0)
            r302 = r0
            r0 = 36313209753573276(0x8102ac0004179c, double:3.027958297494303E-306)
            r306 = r0
            r0 = r302
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L3d
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.sharing.broadcastflow.model.SendButtonStates.A02(X.BMK, X.CPd):boolean");
    }

    public static boolean A03(BMK bmk, CPd cPd, ImmutableMap immutableMap) {
        boolean z = false;
        if (!A02(bmk, cPd)) {
            1Du A0i = 4YU.A0i(immutableMap);
            int i = 0;
            while (A0i.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0i);
                if (i <= cPd.A04()) {
                    if (A0z.getValue().equals(SendState.SENT) || A0z.getValue().equals(SendState.UNDO) || A0z.getValue().equals(SendState.OPEN)) {
                        if (cPd.A05(i)) {
                            z = true;
                        } else {
                            i++;
                        }
                    }
                }
            }
            return cPd.A05(i);
        }
        return z;
    }

    public static boolean A04(BMK bmk, CPd cPd, ImmutableMap immutableMap) {
        boolean z = false;
        if (!A02(bmk, cPd)) {
            1Du A0i = 4YU.A0i(immutableMap);
            int i = 0;
            while (A0i.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0i);
                if (i <= cPd.A04()) {
                    ThreadKey threadKey = (ThreadKey) A0z.getKey();
                    if (threadKey.A15() || threadKey.A1A()) {
                        if (A0z.getValue().equals(SendState.SENT) || A0z.getValue().equals(SendState.UNDO) || A0z.getValue().equals(SendState.OPEN)) {
                            if (cPd.A06(i)) {
                                z = true;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            return cPd.A06(i);
        }
        return z;
    }

    public SendState A05(ThreadKey threadKey) {
        this.A00.get();
        ImmutableMap immutableMap = this.A01;
        if (immutableMap.containsKey(threadKey)) {
            immutableMap.get(threadKey);
        }
        if (immutableMap.containsKey(threadKey)) {
            immutableMap.get(threadKey);
        }
        return immutableMap.containsKey(threadKey) ? (SendState) immutableMap.get(threadKey) : SendState.SEND;
    }

    public ImmutableList A06(SendState sendState) {
        ImmutableList.Builder A0h = 4YU.A0h();
        1Du A0i = 4YU.A0i(this.A01);
        while (A0i.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0i);
            Object key = A0z.getKey();
            if (A0z.getValue() == sendState) {
                A0h.m11011add(key);
            }
        }
        return A0h.build();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableMap immutableMap = this.A01;
        AbG.A1G(parcel, immutableMap);
        1Du A0i = 4YU.A0i(immutableMap);
        while (A0i.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0i);
            parcel.writeParcelable((Parcelable) A0z.getKey(), i);
            parcel.writeParcelable((Parcelable) A0z.getValue(), i);
        }
    }
}
