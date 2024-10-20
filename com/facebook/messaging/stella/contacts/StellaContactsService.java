package com.facebook.messaging.stella.contacts;

import X.0FI;
import X.0S2;
import X.0TL;
import X.0fH;
import X.1BK;
import X.1BL;
import X.1BV;
import X.5Nz;
import X.5O0;
import X.C00i;
import X.C4F;
import X.C7lm;
import X.CP4;
import X.GOo;
import X.JQz;
import X.KNP;
import X.L27;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Pair;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableMap;

/* loaded from: StellaContactsService.class */
public class StellaContactsService extends 0TL {
    public FbUserSession A00;
    public C4F A01;
    public final C00i A02 = 1BV.A00(85157);
    public final AnonymousClass1 A03 = new AnonymousClass1();

    /* renamed from: com.facebook.messaging.stella.contacts.StellaContactsService$1, reason: invalid class name */
    /* loaded from: StellaContactsService$1.class */
    public final class AnonymousClass1 extends Binder implements IInterface {
        public AnonymousClass1() {
            int A03 = 0FI.A03(-422344728);
            attachInterface(this, "com.facebook.messaging.stella.contacts.api.StellaContactsInterface");
            0FI.A09(1312464310, A03);
        }

        public AnonymousClass1() {
            this();
            0FI.A09(-1676729495, 0FI.A03(-1845023742));
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            0FI.A09(721715510, 0FI.A03(-982626396));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v30, types: [android.content.Context, com.facebook.messaging.stella.contacts.StellaContactsService] */
        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            String error;
            int i4;
            int A03 = 0FI.A03(-1459812641);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.messaging.stella.contacts.api.StellaContactsInterface");
                    if (i == 1) {
                        String readString = parcel.readString();
                        int A032 = 0FI.A03(1355083117);
                        5Nz r0 = new 5Nz(C7lm.A00(readString), "ContactsService");
                        r0.A02();
                        ?? r02 = StellaContactsService.this;
                        Pair A00 = ((L27) r02.A02.get()).A00(r02, null, r02.A00);
                        if (A00 == L27.A02) {
                            0fH.A0l("StellaContactsService", "Received request");
                            error = r02.A01.A00((Context) r02, r02.A00, r0, readString);
                            5O0.A01(r0, ((5O0) r0).A00);
                            i4 = -1332477415;
                        } else {
                            0fH.A17("StellaContactsService", "Request not allowed %s", new Object[]{A00.second});
                            r0.A05(0S2.A0R, (String) A00.second, true);
                            5O0.A01(r0, ((5O0) r0).A00);
                            error = CP4.error(GOo.A03(A00), (String) A00.second);
                            i4 = 1181659252;
                        }
                        0FI.A09(i4, A032);
                        parcel2.writeNoException();
                        parcel2.writeString(error);
                        i3 = -800489325;
                        0FI.A09(i3, A03);
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.messaging.stella.contacts.api.StellaContactsInterface");
                    i3 = -395177632;
                    0FI.A09(i3, A03);
                    return true;
                }
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            0FI.A09(-980529245, A03);
            return onTransact;
        }
    }

    public IBinder A01(Intent intent) {
        return this.A03;
    }

    public void A02() {
        super/*X.1AO*/.A02();
        this.A00 = 1BL.A0F();
        ImmutableMap.Builder A0c = 1BK.A0c();
        JQz.A1G(A0c, KNP.FETCH_CONTACTS, 84486);
        JQz.A1G(A0c, KNP.FETCH_GROUPS, 84487);
        this.A01 = new C4F(2342156111593084603L, A0c.build());
    }

    public final String A04() {
        return "com.facebook.orca.fbpermission.MANAGE_CONTACTS";
    }
}
