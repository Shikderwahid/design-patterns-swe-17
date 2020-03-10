﻿namespace DesignPatterns.MidSemester
{
    public class CompressionDecor : BaseDecor
    {
        public CompressionDecor(IStatSaver Base): base(Base)
        {

        }

        public override string statistics(string inStat)
        {
            int len = ToBeCoated.statistics(inStat).Length;
            string container;
            if(len >= 3)
            {
                container = ToBeCoated.statistics(inStat).Substring(0, len - 2);
            }
            else
            {
                container = ToBeCoated.statistics(inStat);
            }

            return container;
        }
    }
}
