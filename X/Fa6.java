package X;

import android.util.Base64;
import com.facebook.auth.credentials.DBLFacebookCredentials;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: Fa6.class */
public final class Fa6 implements InterfaceC10464ti {
    public final C00i A00 = 1BV.A00(49340);
    public final C00i A02 = 1BQ.A01();
    public final C00i A01 = 1BV.A00(49341);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r304v1 */
    /* JADX WARN: Type inference failed for: r304v2 */
    /* JADX WARN: Type inference failed for: r304v3, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r304v4 */
    /* JADX WARN: Type inference failed for: r304v5 */
    public static DBLFacebookCredentials A00(DBLFacebookCredentials dBLFacebookCredentials) {
        ArrayList A0t;
        Collection collection;
        if (dBLFacebookCredentials == null) {
            return null;
        }
        1Bn.A0A(99457);
        String str = dBLFacebookCredentials.mNonce;
        11T.A09(str);
        byte[] decode = Base64.decode(str, 0);
        11T.A0D(decode);
        11T.A0F(decode, 0);
        int length = decode.length;
        if (12 < length) {
            A0t = AnonymousClass001.A0t(12);
            int i = length - 12;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                A0t.add(Byte.valueOf(decode[i2]));
                i = i2 + 1;
            }
        } else {
            A0t = 02L.A06(decode);
        }
        byte[] A0l = 0QD.A0l(A0t);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, F0C.A00(), new GCMParameterSpec(128, A0l));
        int i3 = length - 12;
        if (i3 >= 0) {
            int i4 = 0;
            if (i3 != 0) {
                if (i3 < length) {
                    if (i3 != 1) {
                        collection = AnonymousClass001.A0t(i3);
                        int i5 = 0;
                        do {
                            collection.add(Byte.valueOf(decode[i4]));
                            i5++;
                            if (i5 == i3) {
                                break;
                            }
                            i4++;
                        } while (i4 < length);
                    } else {
                        collection = 11T.A03(Byte.valueOf(decode[0]));
                    }
                } else {
                    collection = 02L.A06(decode);
                }
                byte[] doFinal = cipher.doFinal(0QD.A0l(collection));
                11T.A0D(doFinal);
                return A02(dBLFacebookCredentials, new String(doFinal, C03r.A05));
            }
        }
        collection = C0ty.A00;
        byte[] doFinal2 = cipher.doFinal(0QD.A0l(collection));
        11T.A0D(doFinal2);
        return A02(dBLFacebookCredentials, new String(doFinal2, C03r.A05));
    }

    public static DBLFacebookCredentials A01(DBLFacebookCredentials dBLFacebookCredentials) {
        1Bn.A0A(99457);
        String str = dBLFacebookCredentials.mNonce;
        11T.A09(str);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        11T.A0A(cipher);
        cipher.init(1, F0C.A00());
        byte[] doFinal = cipher.doFinal(DKC.A1a(str, C03r.A05));
        11T.A0A(doFinal);
        byte[] iv = cipher.getIV();
        11T.A0A(iv);
        return A02(dBLFacebookCredentials, DKC.A1B(C1A9.A0K(doFinal, iv), 0));
    }

    public static final DBLFacebookCredentials A02(DBLFacebookCredentials dBLFacebookCredentials, String str) {
        String str2 = dBLFacebookCredentials.mUserId;
        int i = dBLFacebookCredentials.mTime;
        return new DBLFacebookCredentials(str2, dBLFacebookCredentials.mName, dBLFacebookCredentials.mFullName, dBLFacebookCredentials.mUsername, dBLFacebookCredentials.mPicUrl, str, dBLFacebookCredentials.mAlternativeAccessToken, dBLFacebookCredentials.mLopNonce, i, dBLFacebookCredentials.mIsPinSet.booleanValue(), false);
    }

    private void A03(DBLFacebookCredentials dBLFacebookCredentials) {
        DBLFacebookCredentials A01 = A01(dBLFacebookCredentials);
        C10454th c10454th = (C10454th) this.A00.get();
        1G2 r0 = C1mC.A04;
        c10454th.A01.get();
        String str = A01.mUserId;
        if (str != null) {
            1G2 A012 = 1G3.A01(r0, str);
            String str2 = A01.mUserId;
            1G2 A013 = 1G3.A01(C1mC.A0N, str2);
            C00i c00i = c10454th.A03;
            1Ql A0V = 1BL.A0V(c00i);
            A0V.Cdj(A013);
            1G2 r02 = AbstractC10524to.A00;
            11T.A0F(str2, 0);
            A0V.Cdj(1G3.A00(AbstractC10524to.A0F, str2));
            A0V.commit();
            try {
                1Ql A0V2 = 1BL.A0V(c00i);
                A0V2.CaL(A012, ((AnonymousClass244) c10454th.A04.get()).A0W(A01));
                A0V2.commit();
            } catch (IOException e) {
                1BK.A09(c10454th.A02).softReport("FB4ADBLStoreManager", "Error encountered in saving the DBLcredentials in FbSharedPreferences", e);
            }
        }
    }

    private void A04(DBLFacebookCredentials dBLFacebookCredentials) {
        DBLFacebookCredentials A01 = A01(dBLFacebookCredentials);
        C10454th c10454th = (C10454th) this.A00.get();
        String str = A01.mUserId;
        if (str != null) {
            1G2 A012 = 1G3.A01(C1mC.A0N, str);
            try {
                1Ql A0V = 1BL.A0V(c10454th.A03);
                A0V.CaL(A012, ((AnonymousClass244) c10454th.A04.get()).A0W(A01));
                A0V.commit();
            } catch (IOException e) {
                1BK.A09(c10454th.A02).softReport("FB4ADBLStoreManager", "Error encountered in saving the Password account credentials in FbSharedPreferences", e);
            }
        }
    }

    private void A05(String str) {
        1BK.A09(this.A02).D0y("EncryptedDBLStoreManager", 0Pz.A0W("Encountered plain DBL token during ", str), 1, null);
    }

    @Override // X.InterfaceC10464ti
    public boolean BS9(String str) {
        return ((C10454th) this.A00.get()).BS9(str);
    }

    @Override // X.InterfaceC10464ti
    public boolean BUk(String str) {
        return ((C10454th) this.A00.get()).BUk(str);
    }

    @Override // X.InterfaceC10464ti
    public boolean BUr(String str) {
        return ((C10454th) this.A00.get()).BUr(str);
    }

    @Override // X.InterfaceC10464ti
    public DBLFacebookCredentials CiT(String str) {
        String str2;
        DBLFacebookCredentials CiT = ((C10454th) this.A00.get()).CiT(str);
        if (CiT != null && (str2 = CiT.mNonce) != null && !str2.isEmpty() && str2.length() <= 8) {
            A05("retrieve");
            if (BUk(str)) {
                A04(CiT);
            } else {
                A03(CiT);
            }
            CiT = CiT(str);
        }
        return A00(CiT);
    }

    @Override // X.InterfaceC10464ti
    public ArrayList CiU() {
        String str;
        String str2;
        ArrayList A0s = AnonymousClass001.A0s();
        C00i c00i = this.A00;
        Iterator it = ((C10454th) c00i.get()).A01().iterator();
        while (it.hasNext()) {
            DBLFacebookCredentials dBLFacebookCredentials = (DBLFacebookCredentials) it.next();
            if (dBLFacebookCredentials != null && (str2 = dBLFacebookCredentials.mNonce) != null && !str2.isEmpty() && str2.length() <= 8) {
                A05("retrieveOneTapLoginAccounts");
                A03(dBLFacebookCredentials);
            }
        }
        ArrayList CiU = ((C10454th) c00i.get()).CiU();
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it2 = CiU.iterator();
        while (it2.hasNext()) {
            A0s2.add(A00((DBLFacebookCredentials) it2.next()));
        }
        A0s.addAll(A0s2);
        Iterator it3 = ((C10454th) c00i.get()).A02().iterator();
        while (it3.hasNext()) {
            DBLFacebookCredentials dBLFacebookCredentials2 = (DBLFacebookCredentials) it3.next();
            if (dBLFacebookCredentials2 != null && (str = dBLFacebookCredentials2.mNonce) != null && !str.isEmpty() && str.length() <= 8) {
                A05("retrievePasswordAccounts");
                A04(dBLFacebookCredentials2);
            }
        }
        ArrayList CiU2 = ((C10454th) c00i.get()).CiU();
        ArrayList A0s3 = AnonymousClass001.A0s();
        Iterator it4 = CiU2.iterator();
        while (it4.hasNext()) {
            A0s3.add(A00((DBLFacebookCredentials) it4.next()));
        }
        A0s.addAll(A0s3);
        Collections.sort(A0s, new AHU(this.A01.get(), 1));
        return A0s;
    }
}
