package md52514e982df737db6cefaf8b770e7bf9c;


public class BranchRewardsListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.branch.referral.Branch.BranchReferralStateChangedListener,
		io.branch.referral.Branch.BranchListResponseListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onStateChanged:(ZLio/branch/referral/BranchError;)V:GetOnStateChanged_ZLio_branch_referral_BranchError_Handler:IO.Branch.Referral.AndroidNativeBranch/IBranchReferralStateChangedListenerInvoker, Branch-Xamarin-Lib.Droid\n" +
			"n_onReceivingResponse:(Lorg/json/JSONArray;Lio/branch/referral/BranchError;)V:GetOnReceivingResponse_Lorg_json_JSONArray_Lio_branch_referral_BranchError_Handler:IO.Branch.Referral.AndroidNativeBranch/IBranchListResponseListenerInvoker, Branch-Xamarin-Lib.Droid\n" +
			"";
		mono.android.Runtime.register ("BranchXamarinSDK.Droid.BranchRewardsListener, Branch-Xamarin-SDK.Droid", BranchRewardsListener.class, __md_methods);
	}


	public BranchRewardsListener ()
	{
		super ();
		if (getClass () == BranchRewardsListener.class)
			mono.android.TypeManager.Activate ("BranchXamarinSDK.Droid.BranchRewardsListener, Branch-Xamarin-SDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onStateChanged (boolean p0, io.branch.referral.BranchError p1)
	{
		n_onStateChanged (p0, p1);
	}

	private native void n_onStateChanged (boolean p0, io.branch.referral.BranchError p1);


	public void onReceivingResponse (org.json.JSONArray p0, io.branch.referral.BranchError p1)
	{
		n_onReceivingResponse (p0, p1);
	}

	private native void n_onReceivingResponse (org.json.JSONArray p0, io.branch.referral.BranchError p1);

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
