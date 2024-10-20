package X;

import android.content.Context;
import android.media.AudioManager;
import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.AudioDeviceModule;
import com.facebook.rsys.audio.gen.AudioInputRoute;
import com.facebook.rsys.audio.gen.AudioOutputRoute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: Gw0.class */
public final class Gw0 extends Gw1 {
    public AudioApi A00;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public AudioDeviceModule A06;
    public HwZ A07;
    public Executor A08;
    public final HgY A09;
    public final JLv A0A;
    public final boolean A0C;
    public final boolean A0D;
    public volatile AudioOutputRoute A0F;
    public final Object A0E = AnonymousClass001.A0R();
    public final Collection A0B = Collections.synchronizedCollection(AnonymousClass001.A0s());
    public String A01 = AudioOutputRoute.UNKNOWN.identifier;

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, X.JLL] */
    public Gw0(Context context, HFd hFd, JKQ jkq, JLv jLv, HgZ hgZ, HwZ hwZ, Executor executor, ExecutorService executorService, 0DE r310, boolean z) {
        this.A08 = executor;
        this.A0C = z;
        this.A0D = hFd instanceof Gym;
        this.A0A = jLv;
        this.A07 = hwZ;
        RwM rwM = new RwM(this);
        ?? obj = new Object();
        Object systemService = context.getSystemService("audio");
        11T.A0I(systemService, 4YT.A00(40));
        AudioManager audioManager = (AudioManager) systemService;
        this.A09 = new HgY(new Gyj(context, audioManager, null, new I7g(null, new I9J(context, audioManager, null, hFd, jkq, jLv, r310), jkq, jLv), hFd, rwM, jkq, jLv, new HuN(audioManager, null), hgZ, executorService, r310), jLv, new I4r(audioManager, null, jLv, obj));
    }

    public final void A00(boolean z) {
        synchronized (this.A0E) {
            AudioDeviceModule audioDeviceModule = this.A06;
            if (audioDeviceModule != null) {
                if (z) {
                    audioDeviceModule.startRecording();
                } else {
                    audioDeviceModule.stopRecording();
                }
            }
        }
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public ArrayList createAvailableAudioInputRoutes() {
        AudioInputRoute audioInputRoute = AudioInputRoute.DEFAULT;
        11T.A0B(audioInputRoute);
        return C0s8.A10(audioInputRoute);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public ArrayList createAvailableAudioOutputRoutes() {
        AudioOutputRoute audioOutputRoute = AudioOutputRoute.UNKNOWN;
        11T.A0B(audioOutputRoute);
        AudioOutputRoute audioOutputRoute2 = AudioOutputRoute.EARPIECE;
        11T.A0B(audioOutputRoute2);
        AudioOutputRoute audioOutputRoute3 = AudioOutputRoute.SPEAKER;
        11T.A0B(audioOutputRoute3);
        AudioOutputRoute audioOutputRoute4 = AudioOutputRoute.HEADSET;
        11T.A0B(audioOutputRoute4);
        AudioOutputRoute audioOutputRoute5 = AudioOutputRoute.BLUETOOTH;
        11T.A0B(audioOutputRoute5);
        return C0s8.A10(audioOutputRoute, audioOutputRoute2, audioOutputRoute3, audioOutputRoute4, audioOutputRoute5);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setApi(AudioApi audioApi) {
        11T.A0F(audioApi, 0);
        this.A00 = audioApi;
        Collection collection = this.A0B;
        11T.A09(collection);
        synchronized (collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            collection.clear();
        }
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
        11T.A0F(audioDeviceModule, 0);
        synchronized (this.A0E) {
            this.A06 = audioDeviceModule;
        }
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setAudioInputRoute(AudioInputRoute audioInputRoute) {
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setAudioOn(boolean z, boolean z2) {
        Ixo ixo = new Ixo(this, z);
        Executor executor = this.A08;
        if (executor == null) {
            ixo.run();
        } else {
            executor.execute(ixo);
        }
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setAudioOutputRoute(AudioOutputRoute audioOutputRoute, boolean z, boolean z2) {
        11T.A0F(audioOutputRoute, 0);
        J10 j10 = new J10(audioOutputRoute, this, z);
        Executor executor = this.A08;
        if (executor == null) {
            j10.run();
        } else {
            executor.execute(j10);
        }
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setIsCallActive(boolean z) {
        Ixp ixp = new Ixp(this, z);
        Executor executor = this.A08;
        if (executor == null) {
            ixp.run();
        } else {
            executor.execute(ixp);
        }
    }
}
