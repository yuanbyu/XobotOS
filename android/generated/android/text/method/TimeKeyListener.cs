using Sharpen;

namespace android.text.method
{
	[Sharpen.Stub]
	public class TimeKeyListener : android.text.method.NumberKeyListener
	{
		[Sharpen.Stub]
		[Sharpen.ImplementsInterface(@"android.text.method.KeyListener")]
		public override int getInputType()
		{
			throw new System.NotImplementedException();
		}

		[Sharpen.Stub]
		[Sharpen.OverridesMethod(@"android.text.method.NumberKeyListener")]
		protected internal override char[] getAcceptedChars()
		{
			throw new System.NotImplementedException();
		}

		[Sharpen.Stub]
		public static android.text.method.TimeKeyListener getInstance()
		{
			throw new System.NotImplementedException();
		}

		public static readonly char[] CHARACTERS = new char[] { '0', '1', '2', '3', '4', 
			'5', '6', '7', '8', '9', 'a', 'm', 'p', ':' };

		private static android.text.method.TimeKeyListener sInstance;
	}
}
