package md52514e982df737db6cefaf8b770e7bf9c;


public class BranchIdentityListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.branch.referral.Branch.BranchReferralInitListener,
		io.branch.referral.Branch.LogoutStatusListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInitFinished:(Lorg/json/JSONObject;Lio/branch/referral/BranchError;)V:GetOnInitFinished_Lorg_json_JSONObject_Lio_branch_referral_BranchError_Handler:IO.Branch.Referral.AndroidNativeBranch/IBranchReferralInitListenerInvoker, Branch-Xamarin-Lib.Droid\n" +
			"n_onLogoutFinished:(ZLio/branch/referral/BranchError;)V:GetOnLogoutFinished_ZLio_branch_referral_BranchError_Handler:IO.Branch.Referral.AndroidNativeBranch/ILogoutStatusListenerInvoker, Branch-Xamarin-Lib.Droid\n" +
			"";
		mono.android.Runtime.register ("BranchXamarinSDK.Droid.BranchIdentityListener, Branch-Xamarin-SDK.Droid", BranchIdentityListener.class, __md_methods);
	}


	public BranchIdentityListener ()
	{
		super ();
		if (getClass () == BranchIdentityListener.class)
			mono.android.TypeManager.Activate ("BranchXamarinSDK.Droid.BranchIdentityListener, Branch-Xamarin-SDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onInitFinished (org.json.JSONObject p0, io.branch.referral.BranchError p1)
	{
		n_onInitFinished (p0, p1);
	}

	private native void n_onInitFinished (org.json.JSONObject p0, io.branch.referral.BranchError p1);


	public void onLogoutFinished (boolean p0, io.branch.referral.BranchError p1)
	{
		n_onLogoutFinished (p0, p1);
	}

	private native void n_onLogoutFinished (boolean p0, io.branch.referral.BranchError p1);

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
