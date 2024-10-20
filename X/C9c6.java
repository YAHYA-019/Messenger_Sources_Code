package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.9c6, reason: invalid class name */
/* loaded from: 9c6.class */
public final class C9c6 {
    public C96s A00;
    public final MutableLiveData A01;
    public final MutableLiveData A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final FbUserSession A08;

    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v21, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public C9c6(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A08 = fbUserSession;
        this.A03 = 7zM.A0Z();
        this.A04 = 7zM.A0R();
        this.A05 = 1Lm.A01(fbUserSession, 68496);
        this.A06 = 1Bu.A00(68497);
        this.A07 = 1Bq.A00(68500);
        this.A01 = new LiveData(C0ty.A00);
        this.A02 = new LiveData(AnonymousClass960.A05);
        this.A00 = C96s.A02;
    }

    public final void A00() {
        CharSequence charSequence;
        C00i c00i = this.A06.A00;
        String A13 = 4YU.A13(((9YC) c00i.get()).A00());
        char[] cArr = {','};
        11T.A0F(A13, 0);
        int length = A13.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (A13.charAt(length) != cArr[0]) {
                    charSequence = A13.subSequence(0, length + 1);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
        }
        charSequence = "";
        String obj = charSequence.toString();
        C00i c00i2 = this.A07.A00;
        9YB r0 = (9YB) c00i2.get();
        11T.A0F(obj, 1);
        Long l = r0.A00;
        if (l != null) {
            4YV.A0Z(r0.A01).flowAnnotate(l.longValue(), "THREAD_MANAGER_THREADS_VIEWED", obj);
        }
        9YC r02 = (9YC) c00i.get();
        1Ql A08 = 1Br.A08(r02.A00);
        A08.Cdj(7zR.A0j(r02.A01.A00, 1NK.A6A));
        A08.commitImmediately();
        9YB r03 = (9YB) c00i2.get();
        Long l2 = r03.A00;
        if (l2 != null) {
            4YV.A0Z(r03.A01).flowEndSuccess(l2.longValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture] */
    public final void A01() {
        SettableFuture A00;
        7zP.A0O(this.A03).A00(this.A02, AnonymousClass960.A05);
        int ordinal = this.A00.ordinal();
        if (ordinal == 0) {
            A00 = C9kK.A00((C9kK) 1Br.A0B(this.A05), (-1) >>> 1);
        } else if (ordinal == 2) {
            A00 = C9kK.A01((C9kK) 1Br.A0B(this.A05), true);
        } else {
            if (ordinal != 1) {
                throw 1BK.A1F();
            }
            A00 = C9kK.A01((C9kK) 1Br.A0B(this.A05), false);
        }
        1Br.A0D(this.A04, AC8.A00(this, 45), A00);
    }
}
