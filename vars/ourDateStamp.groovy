def call(format)
{
def today = new Date()
   if (format == "ddmmyy" )
   { 
     println today.format("dd/MM/yy")
   }
   if (format == "mmddyy" )
   { 
     println today.format("MM/dd/yy")
   }
}
