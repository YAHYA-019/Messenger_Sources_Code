package com.facebook.cameracore.ardelivery.xplat.scripting;

import X.0S2;
import X.11T;
import X.1BL;
import X.AbF;
import X.AnonymousClass001;
import X.C3s4;
import X.C3sb;
import X.DKE;
import X.EcO;
import X.F1Z;
import X.Fbt;
import X.FfP;
import X.FfX;
import X.Ffj;
import X.GAa;
import X.GCW;
import com.facebook.cameracore.ardelivery.scripting.ScriptingPackageMetadata;
import java.lang.reflect.InvocationTargetException;

/* loaded from: XplatScriptingMetadataFetcher.class */
public final class XplatScriptingMetadataFetcher {
    public GCW metadataDownloader;

    public XplatScriptingMetadataFetcher(GCW gcw) {
        11T.A0F(gcw, 1);
        this.metadataDownloader = gcw;
    }

    public final void fetchMetadata(String str, XplatScriptingMetadataCompletionCallback xplatScriptingMetadataCompletionCallback) {
        boolean A1X = 1BL.A1X(str, xplatScriptingMetadataCompletionCallback);
        GCW gcw = this.metadataDownloader;
        EcO ecO = new EcO(xplatScriptingMetadataCompletionCallback);
        Fbt fbt = (Fbt) gcw;
        synchronized (fbt) {
            ScriptingPackageMetadata scriptingPackageMetadata = (ScriptingPackageMetadata) fbt.A01.get(str);
            if (scriptingPackageMetadata != null) {
                ecO.A00.onSuccess(scriptingPackageMetadata);
            } else {
                GAa gAa = new GAa(ecO, 17);
                try {
                    Ffj ffj = (Ffj) DKE.A0p(F1Z.class, "create", 0);
                    ffj.A01.A05("package_hash", str);
                    ffj.A02 = A1X;
                    C3s4 ACe = ffj.ACe();
                    if (ACe instanceof C3sb) {
                        C3sb c3sb = (C3sb) ACe;
                        if (c3sb != null) {
                            c3sb.A03 = 604800000L;
                            c3sb.A02 = 86400000L;
                            c3sb.A06(AbF.A0C(1174473723077479L));
                            c3sb.A06 = 0S2.A00;
                        }
                    }
                    11T.A0D(ACe);
                    FfP.A00(new FfX(fbt, ecO, gAa, str, A1X ? 1 : 0), fbt.A00, ACe, gAa, 3);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw AnonymousClass001.A0U(e);
                }
            }
        }
    }

    public final GCW getMetadataDownloader() {
        return this.metadataDownloader;
    }

    public final void setMetadataDownloader(GCW gcw) {
        11T.A0F(gcw, 0);
        this.metadataDownloader = gcw;
    }
}
