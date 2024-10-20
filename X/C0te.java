package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.common.mindeputils.IVerboseDebuggable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A07' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.0te, reason: invalid class name */
/* loaded from: 0te.class */
public final class C0te implements IVerboseDebuggable {
    public static int A00 = 255;
    public static final 0KO A01;
    public static final /* synthetic */ C0te[] A02;
    public static final C0te A04;
    public static final C0te A05;
    public static final C0te A06;
    public static final C0te A07;
    public static final C0te A09;
    public static final C0te A0B;
    public final 0uV activityThreadHandlerWhatCodes;
    public final 16N appThreadBinderCodes;
    public final String friendlyName;
    public final C0tb lifecycleState;
    public static final C0te A0A = new C0te(C0tb.PRE_ON_CREATE, "PRE_ON_CREATE", "before on create", 0);
    public static final C0te A03 = new C0te(C0tb.ON_CREATE, "ON_CREATE", "on create", 1);
    public static final C0te A08 = new C0te(C0tb.ON_START, "ON_START", "on start", 2);

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C0tb c0tb = C0tb.ON_RESUME;
        C1A2 c1a2 = C1A2.A00;
        C0tg c0tg = new C0tg("what", c1a2, new C0ti("What", ActionId.RTMP_PACKET_RECEIVED, "RESUME_ACTIVITY", null, false));
        16I r0 = 16I.A02;
        A07 = new C0te(c0tb, new C0tg("binder", r0, new C0ti("Binder", 5, "SCHEDULE_RESUME_ACTIVITY_TRANSACTION", null, false), new C0ti("Binder", -19842, "TRANSACTION_scheduleResumeActivity", null, false)), c0tg, "ON_RESUME", "on resume", 3);
        A05 = new C0te(C0tb.ON_PAUSE, new C0tg("binder", r0, new C0ti("Binder", 1, "SCHEDULE_PAUSE_ACTIVITY_TRANSACTION", null, false), new C0ti("Binder", 1, "TRANSACTION_schedulePauseActivity", null, false)), new C0tg("what", c1a2, new C0ti("What", ActionId.ON_VIEW_CREATED_END, "PAUSE_ACTIVITY", null, false), new C0ti("What", ActionId.DATA_LOAD_START, "PAUSE_ACTIVITY_FINISHING", null, false)), "ON_PAUSE", "on pause", 4);
        A09 = new C0te(C0tb.ON_STOP, "ON_STOP", "on stop", 5);
        A04 = new C0te(C0tb.ON_DESTROY, "ON_DESTROY", "on destroy", 6);
        A06 = new C0te(C0tb.ON_RESTART, "ON_RESTART", "on restart", 7);
        C0te c0te = new C0te(C0tb.UNDEFINED, "UNDEFINED", "undefined", 8);
        A0B = c0te;
        A02 = new C0te[]{A0A, A03, A08, A07, A05, A09, A04, A06, c0te};
        A01 = new 0KO("ActivityLifecycleState");
    }

    public C0te(C0tb c0tb, 16N r303, 0uV r304, String str, String str2, int i) {
        this.friendlyName = str2;
        this.lifecycleState = c0tb;
        r304 = r304 == null ? new C0tg("what", new C1A2[0]) : r304;
        this.activityThreadHandlerWhatCodes = r304;
        r303 = r303 == null ? new C0tg("binder", new 16I[0]) : r303;
        this.appThreadBinderCodes = r303;
        r304.A00 = this;
        r303.A00 = this;
    }

    public C0te(C0tb c0tb, String str, String str2, int i) {
        this(c0tb, null, null, str, str2, i);
    }

    public static C0te valueOf(String str) {
        return (C0te) Enum.valueOf(C0te.class, str);
    }

    public static C0te[] values() {
        return (C0te[]) A02.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o("[ActivityLifecycleState ");
        A0o.append(C0db.A00(name()));
        A0o.append(" - ");
        A0o.append(this.friendlyName);
        A0o.append("\n LifeCycle: \n");
        C0tb c0tb = this.lifecycleState;
        if (c0tb != null) {
            str = 0Pz.A0z("Lifecycle ", c0tb.name(), "(", c0tb.mTriedToFindLifecycleNum ? Integer.toString(c0tb.mLifecycleNum) : "not yet inited", ")");
        } else {
            str = "<N/A>";
        }
        A0o.append(str);
        A0o.append("\n What Codes [Maybe ");
        0uV r0 = this.activityThreadHandlerWhatCodes;
        A0o.append(r0.A04.length);
        A0o.append(" items]: [ \n");
        r0.A00(A0o);
        A0o.append("\n Binder Codes [Maybe ");
        16N r02 = this.appThreadBinderCodes;
        A0o.append(r02.A04.length);
        A0o.append(" items]: [ \n");
        r02.A00(A0o);
        return AnonymousClass001.A0d(" \n ]", A0o);
    }
}
