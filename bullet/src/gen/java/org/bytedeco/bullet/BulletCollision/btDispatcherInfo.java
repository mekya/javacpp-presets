// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btDispatcherInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDispatcherInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btDispatcherInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btDispatcherInfo position(long position) {
        return (btDispatcherInfo)super.position(position);
    }
    @Override public btDispatcherInfo getPointer(long i) {
        return new btDispatcherInfo((Pointer)this).offsetAddress(i);
    }

	/** enum btDispatcherInfo::DispatchFunc */
	public static final int
		DISPATCH_DISCRETE = 1,
		DISPATCH_CONTINUOUS = 2;
	public btDispatcherInfo() { super((Pointer)null); allocate(); }
	private native void allocate();
	public native @Cast("btScalar") float m_timeStep(); public native btDispatcherInfo m_timeStep(float setter);
	public native int m_stepCount(); public native btDispatcherInfo m_stepCount(int setter);
	public native int m_dispatchFunc(); public native btDispatcherInfo m_dispatchFunc(int setter);
	public native @Cast("btScalar") float m_timeOfImpact(); public native btDispatcherInfo m_timeOfImpact(float setter);
	public native @Cast("bool") boolean m_useContinuous(); public native btDispatcherInfo m_useContinuous(boolean setter);
	public native btIDebugDraw m_debugDraw(); public native btDispatcherInfo m_debugDraw(btIDebugDraw setter);
	public native @Cast("bool") boolean m_enableSatConvex(); public native btDispatcherInfo m_enableSatConvex(boolean setter);
	public native @Cast("bool") boolean m_enableSPU(); public native btDispatcherInfo m_enableSPU(boolean setter);
	public native @Cast("bool") boolean m_useEpa(); public native btDispatcherInfo m_useEpa(boolean setter);
	public native @Cast("btScalar") float m_allowedCcdPenetration(); public native btDispatcherInfo m_allowedCcdPenetration(float setter);
	public native @Cast("bool") boolean m_useConvexConservativeDistanceUtil(); public native btDispatcherInfo m_useConvexConservativeDistanceUtil(boolean setter);
	public native @Cast("btScalar") float m_convexConservativeDistanceThreshold(); public native btDispatcherInfo m_convexConservativeDistanceThreshold(float setter);
	public native @Cast("bool") boolean m_deterministicOverlappingPairs(); public native btDispatcherInfo m_deterministicOverlappingPairs(boolean setter);
}