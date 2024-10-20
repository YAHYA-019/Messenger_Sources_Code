package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.user.model.Name;
import com.facebook.user.model.UserKey;
import com.facebook.user.model.WorkUserForeignEntityInfo;
import com.facebook.user.profilepic.PicSquare;
import java.io.Closeable;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: DAu.class */
public abstract class DAu implements Iterator, Closeable {
    public Object A00;
    public boolean A01;
    public final Cursor A02;

    public DAu(Cursor cursor) {
        cursor.getClass();
        this.A02 = cursor;
        this.A00 = null;
        this.A01 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v304, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Integer] */
    public Object A01(Cursor cursor) {
        String str;
        if (this instanceof C1594Amb) {
            return BaC.A09.A00(cursor);
        }
        if (!(this instanceof C1595Amc)) {
            if (this instanceof C1596Amd) {
                return AbG.A0j(cursor.getString(((C1596Amd) this).A00));
            }
            C1597Ame c1597Ame = (C1597Ame) this;
            UserKey A02 = UserKey.A02(AbH.A18(cursor, "user_key"));
            Name name = new Name(AbH.A18(cursor, "first_name"), AbH.A18(cursor, "last_name"), AbH.A18(cursor, PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
            String A18 = AbH.A18(cursor, "profile_pic_square");
            PicSquare A01 = A18 != null ? C12074yn.A01(c1597Ame.A00.A01(A18)) : null;
            1Ks A00 = 1uP.A00(Integer.valueOf(AbI.A00(cursor, "restriction_type")));
            String A182 = AbH.A18(cursor, "messaging_actor_type");
            1Kq valueOf = A182 == null ? 1Kq.A0D : 1Kq.valueOf(A182);
            int A002 = AbI.A00(cursor, 4YT.A00(1013));
            long A022 = AbI.A02(cursor, 4YT.A00(1014));
            boolean A1N = AnonymousClass001.A1N(AbI.A00(cursor, 1BJ.A00(1450)));
            String A183 = AbH.A18(cursor, "username");
            1Kh A0y = AbF.A0y();
            A0y.A02(A02.type, A02.id);
            A0y.A0R = name;
            A0y.A0g = A01;
            A0y.A0f = null;
            A0y.A0i = A00;
            A0y.A01(valueOf);
            A0y.A0D = A002;
            A0y.A0E = A022;
            A0y.A23 = A1N;
            A0y.A1L = A183;
            return AbF.A0w(A0y);
        }
        C1595Amc c1595Amc = (C1595Amc) this;
        Cursor cursor2 = ((DAu) c1595Amc).A02;
        ThreadKey A0K = ThreadKey.A0K(cursor2.getString(c1595Amc.A0I), true);
        UserKey A023 = UserKey.A02(cursor2.getString(c1595Amc.A0K));
        Integer A003 = BTe.A00(cursor2.getString(c1595Amc.A0J));
        UserKey userKey = null;
        if (A003 == 0S2.A0C) {
            A0K.getClass();
            long j = cursor2.getLong(c1595Amc.A0F);
            UserKey A024 = UserKey.A02(cursor2.getString(c1595Amc.A04));
            int i = c1595Amc.A0E;
            if (!cursor2.isNull(i)) {
                userKey = Integer.valueOf(cursor2.getInt(i));
            }
            return new C7u0(A0K, A023, A024, userKey, j);
        }
        String string = cursor2.getString(c1595Amc.A0D);
        String string2 = cursor2.getString(c1595Amc.A0H);
        boolean z = false;
        boolean A1N2 = AnonymousClass001.A1N(cursor2.getInt(c1595Amc.A06));
        String string3 = cursor2.getString(c1595Amc.A0C);
        1Kq valueOf2 = string3 == null ? 1Kq.A0D : 1Kq.valueOf(string3);
        WorkUserForeignEntityInfo A004 = C12074yn.A00(cursor2.getString(c1595Amc.A0M));
        int i2 = c1595Amc.A0G;
        1Ks A005 = cursor2.isNull(i2) ? 1Ks.A05 : 1uP.A00(Integer.valueOf(cursor2.getInt(i2)));
        int i3 = cursor2.getInt(c1595Amc.A02);
        int i4 = cursor2.getInt(c1595Amc.A01);
        String string4 = cursor2.getString(c1595Amc.A0L);
        try {
            C1z1 c1z1 = C1z1.NOT_BLOCKED;
            A023.getClass();
            ParticipantInfo participantInfo = new ParticipantInfo(valueOf2, c1z1, A023, A004, A005, string, null, null, string2, null, string4, null, i3, i4, -1, 0L, 0L, 0L, 0L, A1N2, false, false);
            int i5 = c1595Amc.A04;
            if (!cursor2.isNull(i5)) {
                userKey = UserKey.A02(cursor2.getString(i5));
            }
            int i6 = c1595Amc.A0E;
            int i7 = cursor2.isNull(i6) ? -1 : cursor2.getInt(i6);
            HashSet A0v = AnonymousClass001.A0v();
            long j2 = cursor2.getLong(c1595Amc.A09);
            long j3 = cursor2.getLong(c1595Amc.A0A);
            long j4 = cursor2.getLong(c1595Amc.A0B);
            String string5 = cursor2.getString(c1595Amc.A08);
            boolean A1Q = AnonymousClass001.A1Q(cursor2.getInt(c1595Amc.A05), 1);
            C1zL A006 = BUP.A00(cursor2.getInt(c1595Amc.A00));
            HashSet A07 = C1pq.A07(A006, "adminType", A0v, A0v);
            boolean A1V = 4YV.A1V(cursor2.getInt(c1595Amc.A07), 1);
            if (cursor2.getInt(c1595Amc.A03) == 1) {
                z = true;
            }
            A0K.getClass();
            ThreadParticipant threadParticipant = new ThreadParticipant(participantInfo, A006, userKey, string5, A07, i7, j2, j3, j4, z, A1Q, A1V);
            A003.getClass();
            return new C7u0(A0K, threadParticipant, A003);
        } catch (RuntimeException e) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(e.getMessage());
            A0k.append(4YT.A00(492));
            A0k.append(A0K);
            A0k.append(", type: ");
            if (A003 != null) {
                switch (A003.intValue()) {
                    case 1:
                        str = "BOT";
                        break;
                    case 2:
                        str = "REQUEST";
                        break;
                    default:
                        str = "PARTICIPANT";
                        break;
                }
            } else {
                str = "null";
            }
            A0k.append(str);
            throw AnonymousClass001.A0T(1BL.A0u(", name: ", string, A0k));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A02.close();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.A01) {
            this.A01 = false;
            Cursor cursor = this.A02;
            this.A00 = cursor.moveToNext() ? A01(cursor) : null;
        }
        return AnonymousClass001.A1T(this.A00);
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.A01) {
            this.A01 = false;
            Cursor cursor = this.A02;
            this.A00 = cursor.moveToNext() ? A01(cursor) : null;
        }
        this.A01 = true;
        return this.A00;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass001.A0q(0Pz.A0W(getClass().toString(), " does not support remove()"));
    }
}
