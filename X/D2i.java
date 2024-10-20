package X;

import android.database.DatabaseUtils;
import com.facebook.common.util.TriState;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.MarketplaceThreadData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.UserEmailAddress;
import com.facebook.user.model.UserPhoneNumber;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableCollection;
import java.lang.reflect.Executable;
import java.util.Arrays;
import java.util.List;

/* loaded from: D2i.class */
public final class D2i implements Function {
    public final int A00;

    public D2i(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r305v1, types: [com.facebook.user.model.UserPhoneNumber] */
    /* JADX WARN: Type inference failed for: r305v2 */
    /* JADX WARN: Type inference failed for: r305v3, types: [java.util.AbstractCollection] */
    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        2JY A0B;
        Object userPhoneNumber;
        switch (this.A00) {
            case 0:
                return new UserEmailAddress((String) obj, 0);
            case 1:
                2JY r0 = (2JY) obj;
                if (r0 != null && (A0B = 1BK.A0B(r0, 2JX.class, -612351174, -1550807411)) != null) {
                    String A0r = A0B.A0r(1633468774);
                    String A0r2 = A0B.A0r(-1057996867);
                    userPhoneNumber = new UserPhoneNumber(TriState.valueOf(r0.getBooleanValue(1565553213)), A0r, A0r2, A0r2, 0);
                    break;
                } else {
                    return null;
                }
            case 2:
                return DatabaseUtils.sqlEscapeString(obj == null ? "null" : obj.toString());
            case 3:
            case 4:
                return ((2JX) obj).A1l();
            case 5:
                return AbH.A0y((TreeJNI) obj, -1096448315);
            case 6:
            case 8:
            case 10:
                return ((ThreadSummary) obj).A0r;
            case 7:
            case 9:
            case 11:
                return ((MarketplaceThreadData) obj).A05;
            case 12:
            case 13:
            case 20:
                return ((2JX) obj).A1k();
            case 14:
            case 17:
            case 21:
                return ((2JY) obj).A0L(-227250431, 2JX.class, 635826327);
            case 15:
                return ((2JY) obj).A0L(-1258487138, 2JX.class, 144090422);
            case 16:
            case 19:
                return ((2JY) obj).A0K(632632009, 2JX.class, -1181636035);
            case 18:
                return ((2JY) obj).A0L(950363116, 2JX.class, 1127411613);
            case 22:
                return ((2JX) obj).A2K(892270485, 2025398817);
            case 23:
                ImmutableCollection immutableCollection = (ImmutableCollection) obj;
                userPhoneNumber = AnonymousClass001.A0s();
                if (immutableCollection != null) {
                    1Du it = immutableCollection.iterator();
                    while (it.hasNext()) {
                        2JX A0M = 1BL.A0M(7zL.A0P(it), 632632009, -1181636035);
                        if (!CQi.A08(A0M)) {
                            userPhoneNumber.add(A0M);
                        }
                    }
                    break;
                }
                break;
            case 24:
                AnonymousClass624 anonymousClass624 = (AnonymousClass624) obj;
                if (!(anonymousClass624 instanceof AnonymousClass622)) {
                    return anonymousClass624.toString();
                }
                AnonymousClass622 anonymousClass622 = (AnonymousClass622) anonymousClass624;
                return anonymousClass622 == null ? "null" : 0Pz.A0X(4YT.A00(752), 5Q0.A04(anonymousClass622.A03), '}');
            case 25:
                return 5Q0.A04((Message) obj);
            case 27:
            case 29:
            default:
                obj = null;
            case 26:
            case 30:
                return obj;
            case 28:
                return AnonymousClass001.A0K();
            case 31:
                return ((Iterable) obj).iterator();
            case 32:
                String str = (String) obj;
                if (C5s1.A08.matchesAllOf(str) && !str.isEmpty()) {
                    return str;
                }
                int length = str.length();
                StringBuilder sb = new StringBuilder(length + 16);
                sb.append('\"');
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt == '\r' || charAt == '\\' || charAt == '\"') {
                        sb.append('\\');
                    }
                    sb.append(charAt);
                }
                sb.append('\"');
                return sb.toString();
            case 33:
                C1zA c1zA = AbstractC05474dx.A01;
                return Boolean.valueOf(((List) obj).contains(String.class));
            case 34:
                C1zA c1zA2 = AbstractC05474dx.A01;
                return Boolean.valueOf(((List) obj).contains(Throwable.class));
            case 35:
                C1zA c1zA3 = AbstractC05474dx.A01;
                return Arrays.asList(((Executable) obj).getParameterTypes());
        }
        return userPhoneNumber;
    }
}
