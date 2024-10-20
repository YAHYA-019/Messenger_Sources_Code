package X;

import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.facebook.user.model.UserPhoneNumber;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/* renamed from: X.3dd, reason: invalid class name */
/* loaded from: 3dd.class */
public final /* synthetic */ class C3dd implements Supplier {
    public final /* synthetic */ 2TR A00;
    public final /* synthetic */ java.util.Map A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C3dd(2TR r302, java.util.Map map, boolean z) {
        this.A00 = r302;
        this.A01 = map;
        this.A02 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v135, types: [java.lang.Object, X.1tl] */
    @Override // com.google.common.base.Supplier
    public final Object get() {
        String A00;
        2TR r0 = this.A00;
        java.util.Map map = this.A01;
        boolean z = this.A02;
        C00j.A05("getSmsInviteContacts", 1013009624);
        try {
            ImmutableList.Builder builder = ImmutableList.builder();
            BKW bkw = null;
            try {
                2TU r02 = r0.A0A;
                ArrayList A0s = AnonymousClass001.A0s();
                Uri uri = ContactsContract.Contacts.CONTENT_URI;
                2Uy r03 = new 2Uy("has_phone_number", ConstantsKt.CAMERA_ID_BACK);
                Cursor A01 = 0L0.A01(r02.A01, uri, r03.A02(), (String) null, 2TU.A06, r03.A03(), 1291876175);
                while (A01.moveToNext()) {
                    try {
                        AnonymousClass001.A1J(A0s, A01.getInt(0));
                    } finally {
                        A01.close();
                    }
                }
                BKW A02 = r02.A03.A02(2TU.A01(r02, A0s));
                while (A02.hasNext()) {
                    User user = (User) A02.next();
                    user.A05();
                    if (!user.A05().isEmpty()) {
                        1Du it = user.A05().iterator();
                        while (it.hasNext()) {
                            UserPhoneNumber userPhoneNumber = (UserPhoneNumber) it.next();
                            if (!z || userPhoneNumber.A00 == 2) {
                                1Kh r04 = new 1Kh();
                                r04.A03(user);
                                r04.A06(user.A13, userPhoneNumber.A03);
                                r04.A1W = ImmutableList.of((Object) userPhoneNumber);
                                if (1JF.A0B(user.A1Q)) {
                                    Name name = user.A0X;
                                    String str = name.firstName;
                                    if (str != null || name.lastName != null || name.displayName != null) {
                                        String A002 = name.A00();
                                        String str2 = name.lastName;
                                        C1r5 c1r5 = (C1r5) r0.A0E.get();
                                        r0.A09.AUF();
                                        ?? obj = new Object();
                                        obj.A03 = str;
                                        obj.A01 = str2;
                                        obj.A00 = 0;
                                        obj.A06 = null;
                                        obj.A05 = null;
                                        obj.A09 = null;
                                        obj.A02 = A002;
                                        C00i c00i = c1r5.A01;
                                        obj.A00 = ((C1tm) c00i.get()).A03(((C1tm) c00i.get()).A04(A002));
                                        String A05 = ((C1tm) c00i.get()).A05(obj);
                                        int i = obj.A00;
                                        if (i == 3 || i == 2) {
                                            A05 = c1r5.A04.A01(A05, i);
                                        }
                                        if (A05 != null) {
                                            BreakIterator breakIterator = (BreakIterator) c1r5.A00.get();
                                            breakIterator.setText(A05);
                                            int first = breakIterator.first();
                                            int next = breakIterator.next();
                                            if (next != -1) {
                                                A05 = A05.substring(first, next);
                                            }
                                            if (A05 != null) {
                                                A00 = c1r5.A03.A00(A05);
                                                r04.A1O = A00;
                                            }
                                        }
                                    }
                                    A00 = null;
                                    r04.A1O = A00;
                                }
                                builder.m11011add((Object) new User(r04));
                            }
                        }
                    }
                }
                A02.A00.close();
                ImmutableList A03 = 2TR.A03(builder.build(), map, true);
                LinkedList linkedList = new LinkedList();
                2Ri.A0H(A03, linkedList);
                Collections.sort(linkedList, new G6e(r0, 3));
                ImmutableList copyOf = ImmutableList.copyOf((Collection) linkedList);
                C00j.A01(1766541972);
                return copyOf;
            } catch (Throwable th) {
                if (0 != 0) {
                    bkw.A00.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(-172133139);
            throw th2;
        }
    }
}
