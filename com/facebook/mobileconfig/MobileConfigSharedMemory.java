package com.facebook.mobileconfig;

import X.0fH;
import X.1BK;
import X.AnonymousClass001;
import X.C0gh;
import X.RN2;
import X.SGE;
import android.os.ParcelFileDescriptor;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.HashSet;

/* loaded from: MobileConfigSharedMemory.class */
public class MobileConfigSharedMemory {
    public static String TAG = "MobileConfigSharedMemory";
    public static final ReferenceQueue mBufferQueue;
    public static final HashSet references;

    static {
        C0gh.A02("mobileconfig-jni");
        mBufferQueue = new ReferenceQueue();
        references = AnonymousClass001.A0v();
    }

    public static void cleanupUnusedBuffers() {
        synchronized (MobileConfigSharedMemory.class) {
            while (true) {
                SGE poll = mBufferQueue.poll();
                if (poll != null) {
                    SGE sge = poll;
                    references.remove(sge);
                    int i = sge.A00;
                    long j = sge.A02;
                    int i2 = sge.A01;
                    String str = sge.A03;
                    if (!closeMemoryResources(i, j, i2, str)) {
                        0fH.A14(TAG, "Failed to close memory resources %d %s", new Object[]{Integer.valueOf(i), str});
                    }
                    poll.clear();
                }
            }
        }
    }

    public static native int closeMemoryFile(int i);

    public static native int closeMemoryMap(long j, int i);

    public static boolean closeMemoryResources(int i, long j, int i2, String str) {
        String str2;
        Object[] A1a;
        String str3;
        int closeMemoryMap = closeMemoryMap(j, i2);
        if (closeMemoryMap != 0) {
            str2 = TAG;
            A1a = 1BK.A1a(Integer.valueOf(i), str, closeMemoryMap);
            str3 = "Failed to close mmap %d %s result: %d";
        } else {
            int closeMemoryFile = closeMemoryFile(i);
            if (closeMemoryFile == 0) {
                return true;
            }
            str2 = TAG;
            A1a = 1BK.A1a(Integer.valueOf(i), str, closeMemoryFile);
            str3 = "Failed to close file %d %s result: %d";
        }
        0fH.A14(str2, str3, A1a);
        return false;
    }

    public static native Object createByteBufferFromMap(long j, int i);

    public static native int createNewSharedMemoryRegion(int i, String str);

    public static RN2 createSharedMemory(int i, String str) {
        int createNewSharedMemoryRegion = createNewSharedMemoryRegion(i, str);
        if (createNewSharedMemoryRegion >= 0) {
            return new RN2(createNewSharedMemoryRegion, i, str);
        }
        0fH.A14(TAG, "Failed to create shared memory region %s Error: %d", AnonymousClass001.A1b(str, createNewSharedMemoryRegion));
        return null;
    }

    public static RN2 fromFd(ParcelFileDescriptor parcelFileDescriptor, int i, String str) {
        if (parcelFileDescriptor == null) {
            return null;
        }
        return new RN2(parcelFileDescriptor.detachFd(), i, str);
    }

    public static ByteBuffer getByteBuffer(RN2 rn2) {
        ByteBuffer byteBuffer;
        synchronized (MobileConfigSharedMemory.class) {
            byteBuffer = null;
            if (rn2 == null) {
                0fH.A0k(TAG, "Failed to create buffer. Invalid memory info");
            } else if (rn2.A00 > 0) {
                0fH.A0k(TAG, "Failed to create buffer. Buffer already created for shared memory region");
            } else {
                int i = rn2.A02;
                int i2 = rn2.A01;
                long memoryMapRegion = memoryMapRegion(i, i2);
                if (memoryMapRegion < 0) {
                    0fH.A14(TAG, "Failed to create memory region for shared memory %d %s", new Object[]{Integer.valueOf(i2), rn2.A03});
                } else {
                    rn2.A00 = memoryMapRegion;
                    byteBuffer = (ByteBuffer) createByteBufferFromMap(memoryMapRegion, i);
                    references.add(new SGE(rn2.A03, mBufferQueue, byteBuffer, i2, i, rn2.A00));
                }
            }
        }
        return byteBuffer;
    }

    public static ParcelFileDescriptor getParcelFileDescriptor(RN2 rn2) {
        if (rn2 == null) {
            return null;
        }
        return ParcelFileDescriptor.fromFd(rn2.A01);
    }

    public static native long memoryMapRegion(int i, int i2);
}
