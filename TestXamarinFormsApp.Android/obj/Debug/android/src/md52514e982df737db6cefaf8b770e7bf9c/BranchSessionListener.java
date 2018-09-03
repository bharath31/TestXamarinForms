package md52514e982df737db6cefaf8b770e7bf9c;


public class BranchSessionListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.branch.referral.Branch.BranchReferralInitListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInitFinished:(Lorg/json/JSONObject;Lio/branch/referral/BranchError;)V:GetOnInitFinished_Lorg_json_JSONObject_Lio_branch_referral_BranchError_Handler:IO.Branch.Referral.AndroidNativeBranch/IBranchReferralInitListenerInvoker, Branch-Xamarin-Lib.Droid\n" +
			"";
		mono.android.Runtime.register ("BranchXamarinSDK.Droid.BranchSessionListener, Branch-Xamarin-SDK.Droid", BranchSessionListener.class, __md_methods);
	}


	public BranchSessionListener ()
	{
		super ();
		if (getClass () == BranchSessionListener.class)
			mono.android.TypeManager.Activate ("BranchXamarinSDK.Droid.BranchSessionListener, Branch-Xamarin-SDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onInitFinished (org.json.JSONObject p0, io.branch.referral.BranchError p1)
	{
		n_onInitFinished (p0, p1);
	}

	private native void n_onInitFinished (org.json.JSONObject p0, io.branch.referral.BranchError p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
