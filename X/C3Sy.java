package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonErrorException;

/* renamed from: X.3Sy, reason: invalid class name */
/* loaded from: 3Sy.class */
public final class C3Sy {
    public 1BY A00;
    public final C00i A05 = 1BV.A01((1BY) null, 82732);
    public final C00i A06 = 1BV.A01((1BY) null, 84651);
    public final C00i A07 = 1BV.A01((1BY) null, 84373);
    public final C15h A0E = new DBe(this, ActionId.TIMEOUT);
    public final C5O A0D = (C5O) 1Bi.A03(84698);
    public final C00i A04 = 1BQ.A02(16960);
    public final C00i A0B = 1BQ.A02(16772);
    public final C00i A02 = 1BQ.A02(84668);
    public final C00i A09 = 1BQ.A02(84666);
    public final C00i A0A = 1BQ.A02(84622);
    public final C00i A08 = 1BQ.A02(84543);
    public final FbNetworkManager A01 = (FbNetworkManager) 1Bi.A03(16687);
    public final C00i A03 = 1BQ.A02(99390);
    public final 3oV A0F = (3oV) 1Bi.A03(Constants.LOAD_RESULT_PGO);
    public final DIy A0C = new Cmf(this);

    public C3Sy(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static int A00(Exception exc) {
        ApiErrorResult A00;
        int i = -1;
        2L0 cause = exc.getCause();
        if (cause instanceof TigonErrorException) {
            TigonError tigonError = ((TigonErrorException) cause).tigonError;
            if (tigonError != null) {
                i = tigonError.category.value;
            }
        } else if ((cause instanceof 2L0) && (A00 = cause.A00()) != null) {
            return A00.A00();
        }
        return i;
    }

    public static final C3Sy A01(1BO r301) {
        return new C3Sy(r301);
    }
}
