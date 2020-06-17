function hanyaAngka(evt){
    var charCode = (evt.which) ? evt.which :event.keyCode
    return false;
    return true;
}
function validasi_inputBarang(form){
    if(from.kode.value=="") {
        alert("Kode Barang masih kosong!");
        form.kode.focus();
        return(false);
    } else if (form.nama.value=="") {
        alert("Nama Barang masih kosong!");
        form.nama.focus();
        return(false);
    } else if (form.harga.value=="") {
        alert("stok masih kosong!");
        form.stok.focus();
        return (false);
    }
    return(true);
}
function validasi_inputSupplier(form){
    if(from.kode.value=="") {
        alert("Kode Supplier masih kosong!");
        form.kode.focus();
        return(false);
    } else if (form.nama.value=="") {
        alert("Nama Supplier masih kosong!");
        form.nama.focus();
        return(false);
    } else if (form.alamat.value=="") {
        alert("alamat masih kosong!");
        form.alamat.focus();
        return (false);
    
    } else if (form.telp.value=="") {
        alert("telepon masih kosong!");
        form.telp.focus();
        return (false);
    }
    return(true);
}
function validasi_inputAkun(form){
    if(from.kode.value=="") {
        alert("Nomer Akun masih kosong!");
        form.nomer.focus();
        return(false);
    } else if (form.nama.value=="") {
        alert("Nama Akun masih kosong!");
        form.nama.focus();
        return(false);
    }
    return(true);
}
function validasi_inputUser(form){
    if(from.id.value=="") {
        alert("Id User masih kosong!");
        form.id.focus();
        return(false);
    } else if (form.nama.value=="") {
        alert("Nama user masih kosong!");
        form.nama.focus();
        return(false);
    } else if (form.password.value=="") {
        alert("password masih kosong!");
        form.password.focus();
        return (false);
    }
    return(true);
}
function validasi_inputpelanggan(form){
    if(from.id.value=="") {
        alert("Id pelanggan masih kosong!");
        form.id.focus();
        return(false);
    } else if (form.nama.value=="") {
        alert("Nama pelanggan masih kosong!");
        form.nama.focus();
        return(false);
    } else if (form.alamat.value=="") {
        alert("alamat masih kosong!");
        form.alamat.focus();
        return (false);
    }else if (form.telepon.value=="") {
        alert("telepon masih kosong!");
        form.telepon.focus();
        return (false);
    }
    return(true);
}