using BranchXamarinSDK;
using System.Collections.Generic;
using System.ComponentModel;
using Xamarin.Forms;

namespace TestXamarinFormsApp
{
	public class TestXamarinFormsAppBUO : Application, IBranchBUOSessionInterface
	{

		public TestXamarinFormsAppBUO()
		{
		}

		#region IBranchBUOSessionInterface implementation

		public void InitSessionComplete(BranchUniversalObject buo, BranchLinkProperties blp)
		{
		}

		public void SessionRequestError(BranchError error)
		{
		}

		#endregion
	}
}