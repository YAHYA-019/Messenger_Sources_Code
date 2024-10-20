package X;

import com.facebook.graphservice.interfaces.Summary;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonErrorException;

/* renamed from: X.4Qa, reason: invalid class name */
/* loaded from: 4Qa.class */
public final class C4Qa extends TigonErrorException {
    public final boolean isEnhancedWithDetails;
    public final Summary summary;

    public C4Qa(Summary summary, TigonErrorException tigonErrorException, boolean z) {
        super(tigonErrorException.tigonError);
        this.summary = summary;
        this.isEnhancedWithDetails = z;
    }

    public C4Qa A00(String str) {
        if (this.isEnhancedWithDetails) {
            return this;
        }
        TigonError tigonError = this.tigonError;
        return new C4Qa(this.summary, new TigonErrorException(new TigonError(tigonError.category, tigonError.errorDomain, tigonError.domainErrorCode, 0Pz.A0j(tigonError.analyticsDetail, ", query=", str))), true);
    }
}
