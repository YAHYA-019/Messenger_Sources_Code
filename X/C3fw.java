package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.quicklog.EventBuilder;

/* renamed from: X.3fw, reason: invalid class name */
/* loaded from: 3fw.class */
public final /* synthetic */ class C3fw implements Runnable {
    public static final String __redex_internal_original_name = "UnexpectedEventBuilderImpl$$ExternalSyntheticLambda0";
    public final /* synthetic */ 1S2 A00;

    @Override // java.lang.Runnable
    public final void run() {
        1S2 r0 = this.A00;
        C15h c15h = r0.A00;
        if (c15h == null) {
            throw AnonymousClass001.A0N("mReportSourceRefProvider is null");
        }
        EventBuilder eventBuilder = r0.A01;
        eventBuilder.annotate(ErrorReportingConstants.REPORT_SOURCE_REF, (String) c15h.get());
        eventBuilder.report();
    }
}
