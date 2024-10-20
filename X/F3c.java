package X;

import android.util.JsonReader;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.Random;

/* loaded from: F3c.class */
public abstract class F3c {
    public static final Random A00 = new Random();

    /* JADX WARN: Type inference failed for: r0v49, types: [X.EYR, java.lang.Object] */
    public static final FHf A00(50G r301, String str) {
        if (str == null) {
            return null;
        }
        int nextInt = A00.nextInt();
        r301.AR8(3, nextInt);
        r301.AR2(3, nextInt, Property.SYMBOL_Z_ORDER_SOURCE, "");
        1kF.A01("GraphQLBlokParse.parseBloksBundleTreeWithData");
        r301.currentMonotonicTimestamp();
        try {
            try {
                JsonReader jsonReader = new JsonReader(new StringReader(str));
                try {
                    FxN fxN = new FxN(jsonReader);
                    fxN.BfS();
                    F5I A002 = F5I.A00(fxN);
                    11T.A0A(A002);
                    Egj egj = A002.A00;
                    if (egj != null) {
                        Eqz eqz = egj.A00;
                        if (eqz != null) {
                            r301.currentMonotonicTimestamp();
                            FHf A01 = FHf.A01((EYR) new Object(), eqz, (List) null);
                            jsonReader.close();
                            r301.AR6(3, nextInt);
                            1kF.A00();
                            return A01;
                        }
                    }
                    jsonReader.close();
                    r301.AR5(3, nextInt);
                    1kF.A00();
                    return null;
                } finally {
                }
            } catch (IOException e) {
                FGT.A03("BloksBundleParser", e);
                if (0 != 0) {
                    r301.AR6(3, nextInt);
                } else {
                    r301.AR5(3, nextInt);
                }
                1kF.A00();
                return null;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                r301.AR6(3, nextInt);
            } else {
                r301.AR5(3, nextInt);
            }
            1kF.A00();
            throw th;
        }
    }
}
