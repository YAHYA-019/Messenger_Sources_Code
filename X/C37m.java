package X;

import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.fbservice.service.OperationResult;
import java.util.Collection;

/* renamed from: X.37m, reason: invalid class name */
/* loaded from: 37m.class */
public final class C37m extends 3F9 {
    public final OperationResult mPartialSucessOperationResult;

    public C37m(Parcelable parcelable, Collection collection) {
        super(StringFormatUtil.formatStrLocaleSafe("Operation completed with partial results plus %d exceptions. Setting cause to first exception", Integer.valueOf(collection.size())), collection);
        this.mPartialSucessOperationResult = OperationResult.A04(parcelable);
    }
}
