package X;

import android.text.TextUtils;
import com.facebook.messaging.accountswitch.model.MessengerAccountInfo;
import com.facebook.messaging.accountswitch.model.MessengerAccountType;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.4q4, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4q4.class */
public final class C09444q4 implements InterfaceC09434q3 {
    public C7y6 A00;
    public final C00i A01 = new 1BQ(16511);
    public final FbSharedPreferences A02 = (FbSharedPreferences) 1Bi.A03(33013);
    public volatile int A03 = A00(this);

    public static int A00(C09444q4 c09444q4) {
        int size;
        synchronized (c09444q4) {
            size = c09444q4.A02.Ak5(C1f0.A0B).entrySet().size();
        }
        return size;
    }

    @Override // X.InterfaceC09434q3
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public ArrayList AVB() {
        MessengerAccountInfo messengerAccountInfo;
        ArrayList arrayList = new ArrayList(5);
        ArrayList arrayList2 = new ArrayList();
        synchronized (this) {
            FbSharedPreferences fbSharedPreferences = this.A02;
            for (Map.Entry entry : fbSharedPreferences.Ak5(C1f0.A0B).entrySet()) {
                try {
                    messengerAccountInfo = AbstractC09454q5.A02((String) entry.getValue());
                } catch (JSONException e) {
                    1BK.A09(this.A01).softReport("Corrupt MessengerAccountInfo Read", "", e);
                    messengerAccountInfo = null;
                }
                if (messengerAccountInfo == null || TextUtils.isEmpty(messengerAccountInfo.A05) || TextUtils.isEmpty(messengerAccountInfo.A0A)) {
                    arrayList2.add((1G2) entry.getKey());
                } else {
                    arrayList.add(messengerAccountInfo);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                4YV.A1J(fbSharedPreferences, (1G2) it.next());
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC09434q3
    public MessengerAccountInfo AVA(String str) {
        1G2 A0D = C1f0.A0B.A0D(str);
        synchronized (this) {
            FbSharedPreferences fbSharedPreferences = this.A02;
            String BD0 = fbSharedPreferences.BD0(A0D);
            if (BD0 != null) {
                try {
                    MessengerAccountInfo A02 = AbstractC09454q5.A02(BD0);
                    if (!TextUtils.isEmpty(A02.A05) && !TextUtils.isEmpty(A02.A0A)) {
                        return A02;
                    }
                } catch (JSONException e) {
                    1BK.A09(this.A01).softReport("Corrupt MessengerAccountInfo Read", "", e);
                }
                4YV.A1J(fbSharedPreferences, A0D);
            }
            return null;
        }
    }

    @Override // X.InterfaceC09434q3
    public int Azj() {
        return this.A03;
    }

    @Override // X.InterfaceC09434q3
    public boolean BNP() {
        boolean z = false;
        if (this.A03 >= 5) {
            z = true;
        }
        return z;
    }

    @Override // X.InterfaceC09434q3
    public MessengerAccountInfo Cby() {
        MessengerAccountInfo AVA;
        User user = (User) 1Bn.A0A(83430);
        String str = (String) 1Bn.A0A(83432);
        if (user == null) {
            AVA = null;
        } else {
            1Wa r0 = (1Wa) 1Bi.A03(66347);
            String str2 = user.A13;
            AVA = AVA(str2);
            MessengerAccountType messengerAccountType = (str == null || !str.equals(str2)) ? MessengerAccountType.A08 : r0.A00() ? MessengerAccountType.A06 : MessengerAccountType.A03;
            if (AVA == null || AVA.A05 == null || AVA.A03 != messengerAccountType) {
                String A00 = user.A0X.A00();
                String str3 = user.A1N;
                int ordinal = messengerAccountType.ordinal();
                if (ordinal != 4 && ordinal != 5) {
                    str3 = null;
                }
                boolean z = true;
                boolean z2 = false;
                if (messengerAccountType == MessengerAccountType.A07) {
                    z2 = true;
                }
                boolean z3 = false;
                if (messengerAccountType == MessengerAccountType.A08) {
                    z3 = true;
                }
                boolean z4 = false;
                if (messengerAccountType == MessengerAccountType.A05) {
                    z4 = true;
                }
                if (messengerAccountType != MessengerAccountType.A04) {
                    z = false;
                }
                MessengerAccountInfo messengerAccountInfo = new MessengerAccountInfo(messengerAccountType, null, A00, null, str3, null, null, str2, 0, -1, 0L, z, z4, z2, z3);
                CjN(messengerAccountInfo);
                return messengerAccountInfo;
            }
        }
        return AVA;
    }

    @Override // X.InterfaceC09434q3
    public void Cdr(String str) {
        1G2 A01 = 1G3.A01(C1f0.A0B, str);
        synchronized (this) {
            4YV.A1J(this.A02, A01);
        }
        this.A03 = A00(this);
        C7y6 c7y6 = this.A00;
        if (c7y6 != null) {
            c7y6.BhO();
        }
    }

    @Override // X.InterfaceC09434q3
    public void CjN(MessengerAccountInfo messengerAccountInfo) {
        1G2 A0D = C1f0.A0B.A0D(messengerAccountInfo.A0A);
        synchronized (this) {
            try {
                String A00 = messengerAccountInfo.A00();
                1Ql edit = this.A02.edit();
                edit.CaL(A0D, A00);
                edit.commit();
            } catch (JSONException e) {
                1BK.A09(this.A01).softReport("Corrupt MessengerAccountInfo Write", "", e);
            }
        }
        this.A03 = A00(this);
        C7y6 c7y6 = this.A00;
        if (c7y6 != null) {
            c7y6.BhO();
        }
    }

    @Override // X.InterfaceC09434q3
    public void CqZ(C7y6 c7y6) {
        this.A00 = c7y6;
    }

    @Override // X.InterfaceC09434q3
    public void clear() {
    }
}
