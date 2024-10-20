package com.google.android.gms.internal.p001authapi;

import X.0FI;
import X.28B;
import X.28E;
import X.28M;
import X.28W;
import X.4FE;
import X.AbstractC00481b7;
import X.AnonymousClass001;
import X.AnonymousClass286;
import X.C27w;
import X.GOp;
import X.JQx;
import X.JQy;
import X.K2H;
import X.K2X;
import X.K4s;
import X.KY4;
import X.KY5;
import X.Kas;
import X.Kd2;
import X.L2G;
import X.L9P;
import X.L9Z;
import X.LCo;
import X.LcK;
import X.LrU;
import X.MGC;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbh;
import com.google.android.gms.auth.api.signin.internal.zbj;
import com.google.android.gms.auth.api.signin.internal.zbq;
import com.google.android.gms.auth.api.signin.internal.zbt;
import com.google.android.gms.common.api.Status;

/* loaded from: zbb.class */
public abstract class zbb extends Binder implements IInterface {
    public zbb(String str) {
        int A03 = 0FI.A03(-288759801);
        attachInterface(this, str);
        0FI.A09(-1964760975, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        0FI.A09(1375053497, 0FI.A03(1901617163));
        return this;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:62:0x0451. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v107, types: [X.28E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v140, types: [java.lang.Object, X.MGC] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int A03;
        int A032;
        UnsupportedOperationException A0p;
        int i3;
        int A033;
        int i4;
        boolean z;
        int i5;
        int A034;
        int i6;
        K2X A07;
        int i7;
        int i8;
        int A035 = 0FI.A03(-1821738767);
        if (i <= 16777215) {
            JQx.A18(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            z = true;
            i8 = -1380969112;
            0FI.A09(i8, A035);
            return z;
        }
        if (!(this instanceof zbal)) {
            if (!(this instanceof zbae)) {
                if (!(this instanceof zby)) {
                    if (!(this instanceof zban)) {
                        if (!(this instanceof zbt)) {
                            zbq zbqVar = (zbq) this;
                            A03 = 0FI.A03(1245419149);
                            switch (i) {
                                case ActionId.ON_VIEW_CREATED_END /* 101 */:
                                    JQy.A0R(parcel, GoogleSignInAccount.CREATOR);
                                    JQy.A0R(parcel, Status.CREATOR);
                                    L9P.A00(parcel);
                                    A032 = 0FI.A03(2092295690);
                                    A0p = AnonymousClass001.A0p();
                                    i3 = -997480892;
                                    0FI.A09(i3, A032);
                                    throw A0p;
                                case ActionId.DATA_LOAD_START /* 102 */:
                                    28W r0 = (Status) JQy.A0R(parcel, Status.CREATOR);
                                    L9P.A00(parcel);
                                    if (!(zbqVar instanceof zbh)) {
                                        A032 = 0FI.A03(1701392226);
                                        A0p = AnonymousClass001.A0p();
                                        i3 = 779169576;
                                        0FI.A09(i3, A032);
                                        throw A0p;
                                    }
                                    A033 = 0FI.A03(-503809526);
                                    ((zbh) zbqVar).A00.A08(r0);
                                    i4 = -1113135254;
                                    0FI.A09(i4, A033);
                                    parcel2.writeNoException();
                                    z = true;
                                    i5 = 1282656160;
                                    break;
                                case ActionId.LEGACY_MARKER /* 103 */:
                                    28W r02 = (Status) JQy.A0R(parcel, Status.CREATOR);
                                    L9P.A00(parcel);
                                    if (!(zbqVar instanceof zbj)) {
                                        A032 = 0FI.A03(420049894);
                                        A0p = AnonymousClass001.A0p();
                                        i3 = 981600391;
                                        0FI.A09(i3, A032);
                                        throw A0p;
                                    }
                                    A033 = 0FI.A03(1723800271);
                                    ((zbj) zbqVar).A00.A08(r02);
                                    i4 = 2001136544;
                                    0FI.A09(i4, A033);
                                    parcel2.writeNoException();
                                    z = true;
                                    i5 = 1282656160;
                                    break;
                                default:
                                    z = false;
                                    i5 = 69625722;
                                    break;
                            }
                        } else {
                            zbt zbtVar = (zbt) this;
                            A03 = 0FI.A03(972203475);
                            z = true;
                            if (i == 1) {
                                A034 = 0FI.A03(-1908095713);
                                zbt.A00(zbtVar);
                                Context context = zbtVar.A00;
                                LCo A00 = LCo.A00(context);
                                GoogleSignInAccount A04 = A00.A04();
                                GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.A0C;
                                if (A04 != null) {
                                    googleSignInOptions = A00.A05();
                                }
                                AbstractC00481b7.A02(googleSignInOptions);
                                AnonymousClass286 anonymousClass286 = Kd2.A02;
                                C27w c27w = new C27w(context, googleSignInOptions, anonymousClass286, new 28B(Looper.getMainLooper(), (28E) new Object()));
                                if (A04 != null) {
                                    28M r03 = c27w.A05;
                                    Context context2 = c27w.A01;
                                    boolean A1Q = AnonymousClass001.A1Q(K2H.A02(c27w), 3);
                                    L9Z.A00.A00("Revoking access");
                                    String A01 = LCo.A01(LCo.A00(context2), "refreshToken");
                                    L9Z.A02(context2);
                                    if (A1Q) {
                                        String str = LrU.__redex_internal_original_name;
                                        if (A01 == null) {
                                            Status status = new Status(4, null);
                                            AbstractC00481b7.A08(!GOp.A1U(status.BCJ().A00), "Status code must not be SUCCESS");
                                            A07 = new K2X(status);
                                            A07.A08(status);
                                        } else {
                                            LrU lrU = new LrU(A01);
                                            new Thread((Runnable) lrU).start();
                                            A07 = lrU.A00;
                                        }
                                    } else {
                                        A07 = r03.A07(new K4s(anonymousClass286, r03));
                                    }
                                    A07.A03(new LcK(A07, (MGC) new Object(), Kas.A00, new 4FE()));
                                    i6 = 659214002;
                                } else {
                                    c27w.A03();
                                    i6 = 1456626855;
                                }
                            } else if (i != 2) {
                                z = false;
                                i5 = 1103574563;
                            } else {
                                A034 = 0FI.A03(-1912087391);
                                zbt.A00(zbtVar);
                                L2G.A00(zbtVar.A00).A01();
                                i6 = -387719590;
                            }
                            0FI.A09(i6, A034);
                            i5 = -711435128;
                        }
                    } else {
                        zban zbanVar = (zban) this;
                        A03 = 0FI.A03(1215893838);
                        z = true;
                        if (i == 1) {
                            Status status2 = (Status) JQy.A0R(parcel, Status.CREATOR);
                            Parcelable A0R = JQy.A0R(parcel, PendingIntent.CREATOR);
                            L9P.A00(parcel);
                            int A036 = 0FI.A03(-2033400598);
                            KY4.A00(status2, zbanVar.A00, A0R);
                            0FI.A09(-1790588718, A036);
                            i5 = 1624185551;
                        } else {
                            z = false;
                            i5 = 743869111;
                        }
                    }
                } else {
                    zby zbyVar = (zby) this;
                    A03 = 0FI.A03(-28246904);
                    z = true;
                    if (i == 1) {
                        Status status3 = (Status) JQy.A0R(parcel, Status.CREATOR);
                        Parcelable A0R2 = JQy.A0R(parcel, AuthorizationResult.CREATOR);
                        L9P.A00(parcel);
                        int A037 = 0FI.A03(325108610);
                        if (status3.A00 <= 0) {
                            zbyVar.A00.A01(A0R2);
                            i7 = -812010017;
                        } else {
                            zbyVar.A00.A00(KY5.A00(status3));
                            i7 = 1661057560;
                        }
                        0FI.A09(i7, A037);
                        i5 = 1863990908;
                    } else {
                        z = false;
                        i5 = 914351497;
                    }
                }
            } else {
                zbae zbaeVar = (zbae) this;
                A03 = 0FI.A03(2121260181);
                z = true;
                if (i == 1) {
                    Status status4 = (Status) JQy.A0R(parcel, Status.CREATOR);
                    Parcelable A0R3 = JQy.A0R(parcel, SavePasswordResult.CREATOR);
                    L9P.A00(parcel);
                    int A038 = 0FI.A03(512255099);
                    KY4.A00(status4, zbaeVar.A00, A0R3);
                    0FI.A09(1630584718, A038);
                    i5 = 504495550;
                } else {
                    z = false;
                    i5 = 1415680718;
                }
            }
        } else {
            zbal zbalVar = (zbal) this;
            A03 = 0FI.A03(2002618991);
            z = true;
            if (i == 1) {
                Status status5 = (Status) JQy.A0R(parcel, Status.CREATOR);
                Parcelable A0R4 = JQy.A0R(parcel, BeginSignInResult.CREATOR);
                L9P.A00(parcel);
                int A039 = 0FI.A03(-1079694785);
                KY4.A00(status5, zbalVar.A00, A0R4);
                0FI.A09(-1063151621, A039);
                i5 = -1364021340;
            } else {
                z = false;
                i5 = 375317160;
            }
        }
        0FI.A09(i5, A03);
        i8 = 1020434458;
        0FI.A09(i8, A035);
        return z;
    }
}
