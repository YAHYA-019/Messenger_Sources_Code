package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.base.Function;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: D3a.class */
public final class D3a implements 2eF {
    public final int A00;
    public final Object A01;

    public D3a(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        Object obj2;
        switch (this.A00) {
            case 0:
                List list = (List) obj;
                ArrayList A1B = AbJ.A1B(list);
                final C05584eW c05584eW = (C05584eW) 1Bn.A0A(49188);
                for (int i = 0; i < list.size(); i++) {
                    final User A0u = AbG.A0u(list, i);
                    final int i2 = i;
                    A1B.add(AbJ.A0t(c05584eW.A02, new Function() { // from class: X.4eo
                        @Override // com.google.common.base.Function
                        public /* bridge */ /* synthetic */ Object apply(Object obj3) {
                            4iH r0 = (4iH) 1Bi.A03(49212);
                            C05584eW c05584eW2 = C05584eW.this;
                            4iI r02 = (4iI) 1Hv.A02((Context) 1Bn.A0E((Context) null, c05584eW2.A00, 83719), 67720);
                            C00i c00i = c05584eW2.A01;
                            Context context = (Context) c00i.get();
                            User user = A0u;
                            String str = user.A13;
                            HashSet hashSet = null;
                            4iO r03 = new 4iO();
                            r03.A05 = context;
                            r03.A0D = str;
                            r03.A0B = user.A0X.A00();
                            r03.A09 = IconCompat.A01((Bitmap) obj3);
                            r03.A02 = i2;
                            Set singleton = Collections.singleton(AbstractC00603o4.A00(450));
                            0WH r04 = new 0WH(0);
                            r04.addAll(singleton);
                            r03.A0F = r04;
                            UserKey userKey = user.A0k;
                            11T.A0F(userKey, 0);
                            ThreadKey A00 = 4iI.A00(r02, userKey);
                            A00.getClass();
                            r03.A0P = new Intent[]{r0.A03(A00)};
                            1fF r05 = c05584eW2.A03;
                            if (!1fF.A01(r05, 1fF.A00(r05).AZk(36324204869996031L))) {
                                if (TextUtils.isEmpty(r03.A0B)) {
                                    throw AnonymousClass001.A0L("Shortcut must have a non-empty label");
                                }
                                Intent[] intentArr = r03.A0P;
                                if (intentArr == null || intentArr.length == 0) {
                                    throw AnonymousClass001.A0L("Shortcut must have an intent");
                                }
                                return r03;
                            }
                            r03.A0N = true;
                            if (1fF.A01(r05, 1fF.A00(r05).AZk(36324204870061568L))) {
                                hashSet = AnonymousClass001.A0v();
                                hashSet.add("actions.intent.SEND_MESSAGE");
                            }
                            if (TextUtils.isEmpty(r03.A0B)) {
                                throw new IllegalArgumentException("Shortcut must have a non-empty label");
                            }
                            Intent[] intentArr2 = r03.A0P;
                            if (intentArr2 == null || intentArr2.length == 0) {
                                throw AnonymousClass001.A0L("Shortcut must have an intent");
                            }
                            if (hashSet != null) {
                                Set set = r03.A0F;
                                if (set == null) {
                                    set = AnonymousClass001.A0v();
                                    r03.A0F = set;
                                }
                                set.addAll(hashSet);
                            }
                            4iS.A04((Context) c00i.get(), r03);
                            return r03;
                        }
                    }, C05584eW.A00(c05584eW, A0u)));
                }
                return 1Kd.A01(A1B);
            case 1:
                Bqb bqb = (Bqb) obj;
                return 1Kd.A0A(Boolean.valueOf(bqb != null && (bqb.A02 || bqb.A01)));
            case 4:
                C25e c25e = (C25e) this.A01;
                Boolean bool = (Boolean) obj;
                0fH.A0h(bool, 1BJ.A00(308), "remove peer device successfully [%b]");
                C20S c20s = c25e.A0D;
                C00i c00i = c20s.A00.A00;
                c20s.A07(7zN.A0c(c00i), "unregister_result", String.valueOf(bool));
                if (bool == null || !bool.booleanValue()) {
                    c20s.A05(7zN.A0c(c00i), "remove peer device not successful");
                } else {
                    c20s.A02(7zN.A0c(c00i));
                }
                return c25e.A00.A03();
            default:
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                return (mailboxNullable == null || (obj2 = mailboxNullable.value) == null) ? AbI.A0y() : C2wp.A00((C2wp) this.A01, (C48a) obj2);
        }
    }
}
