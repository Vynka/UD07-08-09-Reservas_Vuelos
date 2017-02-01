$( function() {
    $( "#slider-range-min" ).slider({
      range: "min",
      value: 37,
      min: 1,
      max: 750,
      slide: function( event, ui ) {
        $( "#amount" ).val(  ui.value+ "€" );
      }
    });
    $( "#amount" ).val( $( "#slider-range-min" ).slider( "value" )+ "€"  );
  } );
  
  $( function() {
    var dateFormat = "mm/dd/yy",
      from = $( "#fechaSalida" )
        .datepicker({
          defaultDate: "+1w",
          changeMonth: true,
          numberOfMonths: 3
        })
        .on( "change", function() {
          to.datepicker( "option", "minDate", getDate( this ) );
        }),
      to = $( "#fechaLlegada" ).datepicker({
        defaultDate: "+1w",
        changeMonth: true,
        numberOfMonths: 3
      })
      .on( "change", function() {
        from.datepicker( "option", "maxDate", getDate( this ) );
      });
 
    function getDate( element ) {
      var date;
      try {
        date = $.datepicker.parseDate( dateFormat, element.value );
      } catch( error ) {
        date = null;
      }
 
      return date;
    }
  } );
  $('#basicExample').timepicker();


