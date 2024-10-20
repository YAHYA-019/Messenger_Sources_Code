package X;

import com.facebook.fbservice.service.OperationResult;
import java.io.File;

/* loaded from: E7d.class */
public final class E7d extends C2C {
    public final 1Br A00;

    public E7d() {
        super(1BJ.A00(1921));
        this.A00 = 1Bq.A00(99585);
    }

    public OperationResult A00(1TC r302) {
        String string = r302.A00.getString("platform_delete_temp_files_params");
        EjG ejG = (EjG) 1Br.A0B(this.A00);
        if (string == null) {
            throw 1BK.A0h();
        }
        File AUU = ((1MC) 1Br.A0B(ejG.A00)).AUU(244082022);
        C00i c00i = ejG.A01.A00;
        c00i.get();
        File A0D = AnonymousClass001.A0D(AUU, string);
        c00i.get();
        C0L3.A01(A0D);
        OperationResult operationResult = OperationResult.A00;
        11T.A0A(operationResult);
        return operationResult;
    }
}
