package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.acra.constants.ActionId;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbh;
import com.google.android.gms.auth.api.signin.internal.zbj;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.service.zad;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.location.zzal;
import com.google.android.gms.internal.location.zzaw;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzz;
import com.google.android.gms.internal.p001authapi.zba;
import com.google.android.gms.internal.safetynet.zzg;
import com.google.android.gms.internal.safetynet.zzi;
import com.google.android.gms.internal.safetynet.zzj;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* loaded from: K4s.class */
public abstract class K4s extends BasePendingResult implements MGA {
    public final AnonymousClass281 A00;
    public final AnonymousClass286 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4s(AnonymousClass286 anonymousClass286, 28M r303) {
        super(r303);
        AbstractC00481b7.A03(r303, "GoogleApiClient must not be null");
        AbstractC00481b7.A03(anonymousClass286, "Api must not be null");
        this.A00 = anonymousClass286.A01;
        this.A01 = anonymousClass286;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v130, types: [X.KlB] */
    /* JADX WARN: Type inference failed for: r0v146, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v155 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r301v0, types: [X.K4s] */
    public final void A0A(2Ax r302) {
        int A03;
        int i;
        zzal A00;
        zzbe zzbeVar;
        ?? r0 = this instanceof K7q;
        try {
            if (r0 != 0) {
                K7q k7q = (K7q) this;
                K30 k30 = (K30) r302;
                ArrayList A0s = AnonymousClass001.A0s();
                int[] iArr = k7q.A03;
                int i2 = 0;
                do {
                    AnonymousClass001.A1J(A0s, iArr[i2]);
                    i2++;
                } while (i2 < 2);
                zzg zzgVar = k7q.A00;
                String str = k7q.A02;
                String str2 = k7q.A01;
                if (str2 == null) {
                    String A002 = DKB.A00(349);
                    str2 = null;
                    try {
                        Context context = k30.A00;
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null) {
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                            if (applicationInfo != null) {
                                Bundle bundle = ((PackageItemInfo) applicationInfo).metaData;
                                if (bundle != null) {
                                    str2 = (String) bundle.get(A002);
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                int[] iArr2 = new int[A0s.size()];
                int i3 = 0;
                while (true) {
                    if (i3 >= A0s.size()) {
                        break;
                    }
                    iArr2[i3] = JQy.A0H(A0s, i3);
                    i3++;
                }
                zzj zzjVar = (zzj) ((zzi) k30.A03());
                A03 = 0FI.A03(203309036);
                Parcel A003 = zzjVar.A00();
                A003.writeStrongBinder(zzgVar == null ? null : zzgVar.asBinder());
                A003.writeString(str2);
                A003.writeIntArray(iArr2);
                A003.writeInt(3);
                A003.writeString(str);
                zzjVar.A01(A003, 3);
                i = -1263126081;
            } else {
                if (!(this instanceof K7p)) {
                    if (this instanceof K6u) {
                        K6u k6u = (K6u) this;
                        K37 k37 = (K37) r302;
                        zzz zzzVar = new zzz(k6u);
                        PendingIntent pendingIntent = k6u.A00;
                        A00 = LdN.A00(k37);
                        new zzbe(pendingIntent, null, null, zzzVar.asBinder(), null, 2);
                    } else if (this instanceof K6w) {
                        K6w k6w = (K6w) this;
                        K37 k372 = (K37) r302;
                        zzz zzzVar2 = new zzz(k6w);
                        LocationRequest locationRequest = k6w.A01;
                        PendingIntent pendingIntent2 = k6w.A00;
                        A00 = LdN.A00(k372);
                        new zzbe(pendingIntent2, null, null, zzzVar2.asBinder(), zzbc.A00(locationRequest), 1);
                    } else {
                        if (this instanceof K6v) {
                            K6v k6v = (K6v) this;
                            K37 k373 = (K37) r302;
                            zzz zzzVar3 = new zzz(k6v);
                            LocationRequest locationRequest2 = k6v.A01;
                            MD6 md6 = k6v.A00;
                            AbstractC00481b7.A09(AnonymousClass001.A1T(Looper.myLooper()), "Can't create handler inside thread that has not called Looper.prepare()");
                            Looper myLooper = Looper.myLooper();
                            AbstractC00481b7.A03(md6, "Listener must not be null");
                            AbstractC00481b7.A03(myLooper, "Looper must not be null");
                            KjZ kjZ = new KjZ(myLooper, md6);
                            KlB klB = k373.A00;
                            synchronized (klB) {
                                r0 = klB;
                                K37 k374 = ((KlB) r0).A00.A00;
                                k374.A07();
                                KrG krG = kjZ.A01;
                                if (krG != null) {
                                    java.util.Map map = klB.A01;
                                    synchronized (map) {
                                        r0 = map;
                                        zzaw zzawVar = (zzaw) r0.get(krG);
                                        if (zzawVar == null) {
                                            new zzaw(kjZ);
                                        }
                                        map.put(krG, zzawVar);
                                        r0 = map;
                                        ((zzal) k374.A03()).DCC(new zzbe(null, zzawVar.asBinder(), null, zzzVar3.asBinder(), zzbc.A00(locationRequest2), 1));
                                    }
                                }
                            }
                            return;
                        }
                        if (this instanceof K7x) {
                            MGA mga = (K7x) this;
                            ((K37) r302).A0B(mga, mga.A00);
                            return;
                        }
                        if (this instanceof K4q) {
                            zaa zaaVar = (zaa) ((2AD) r302).A03();
                            zad zadVar = new zad((MGA) this);
                            A03 = 0FI.A03(1271216181);
                            Parcel A004 = zaaVar.A00();
                            JQx.A19(zadVar, A004);
                            zaaVar.A01(A004);
                            i = -1813667086;
                        } else if (this instanceof K1u) {
                            K1u k1u = (K1u) this;
                            K31 k31 = (K31) r302;
                            zba zbaVar = (zba) k31.A03();
                            zbj zbjVar = new zbj(k1u);
                            GoogleSignInOptions googleSignInOptions = k31.A00;
                            A03 = 0FI.A03(-620025741);
                            Parcel A005 = zbaVar.A00();
                            JQx.A19(zbjVar, A005);
                            L9P.A01(A005, googleSignInOptions);
                            zbaVar.A01(A005, ActionId.LEGACY_MARKER);
                            i = -756663817;
                        } else {
                            K1t k1t = (K1t) this;
                            K31 k312 = (K31) r302;
                            zba zbaVar2 = (zba) k312.A03();
                            zbh zbhVar = new zbh(k1t);
                            GoogleSignInOptions googleSignInOptions2 = k312.A00;
                            A03 = 0FI.A03(856895497);
                            Parcel A006 = zbaVar2.A00();
                            JQx.A19(zbhVar, A006);
                            L9P.A01(A006, googleSignInOptions2);
                            zbaVar2.A01(A006, ActionId.DATA_LOAD_START);
                            i = 1117280424;
                        }
                    }
                    A00.DCC(zzbeVar);
                    return;
                }
                K7p k7p = (K7p) this;
                K30 k302 = (K30) r302;
                zzg zzgVar2 = k7p.A00;
                byte[] bArr = k7p.A01;
                String str3 = "AIzaSyBHlykNqF68PUTD7PaeZcrUp3giniWh-EM";
                if (TextUtils.isEmpty(str3)) {
                    str3 = null;
                    try {
                        Context context2 = k302.A00;
                        PackageManager packageManager2 = context2.getPackageManager();
                        if (packageManager2 != null) {
                            ApplicationInfo applicationInfo2 = packageManager2.getApplicationInfo(context2.getPackageName(), 128);
                            if (applicationInfo2 != null) {
                                Bundle bundle2 = ((PackageItemInfo) applicationInfo2).metaData;
                                if (bundle2 != null) {
                                    str3 = (String) bundle2.get("com.google.android.safetynet.ATTEST_API_KEY");
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                }
                zzj zzjVar2 = (zzj) ((zzi) k302.A03());
                A03 = 0FI.A03(-1812876441);
                Parcel A007 = zzjVar2.A00();
                A007.writeStrongBinder(zzgVar2 == null ? null : zzgVar2.asBinder());
                A007.writeByteArray(bArr);
                A007.writeString(str3);
                zzjVar2.A01(A007, 7);
                i = 656932770;
            }
            0FI.A09(i, A03);
        } catch (DeadObjectException e) {
            ((K4s) this).A0B(new Status(null, null, e.getLocalizedMessage(), 8));
            throw e;
        } catch (RemoteException unused3) {
            ((K4s) this).A0B(new Status(null, null, r0.getLocalizedMessage(), 8));
        }
    }

    public final void A0B(Status status) {
        AbstractC00481b7.A08(!GOp.A1U(status.A00), "Failed result must not be success");
        A08(A05(status));
    }

    public /* bridge */ /* synthetic */ void Cu3(Object obj) {
        A08((28W) obj);
    }
}
