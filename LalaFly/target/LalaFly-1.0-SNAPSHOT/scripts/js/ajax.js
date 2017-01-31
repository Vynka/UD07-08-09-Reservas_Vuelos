/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function refreshActorList() {
                var custList = $('#selASalida');
                custList.empty();
                $.ajax({
                    "url": "webresources/aeropuertos/",
                    "type": "get",
                    "dataType": "json",
                    "success": function (aeropuertos) {
                        //console.log(actors);
                        $.each(aeropuertos, function (i, aeropuerto) {
                            var li = $('<option/>')
                                    .addClass('ui-menu-item')
                                    .attr('role', 'menuitem')
                                    .appendTo(custList);
                            var a = $('<a/>')
                                    .addClass('ui-all')
                                    .text(aeropuertos.nombre + ' ' + aeropuerto.lastName)
                                    .appendTo(li);
                        });
                    }
                });
            }


