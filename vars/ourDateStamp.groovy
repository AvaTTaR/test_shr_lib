def call(format)
{
def today = new Date()
   if (format == "ddmmyy" )
   { 
     return today.format("dd/MM/yy")
   }
   if (format == "mmddyy" )
   { 
     return today.format("MM/dd/yy")
   }
}
